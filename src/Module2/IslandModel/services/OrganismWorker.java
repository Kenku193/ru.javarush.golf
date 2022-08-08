package Module2.IslandModel.services;


import Module2.IslandModel.entities.organisms.Organism;
import Module2.IslandModel.entities.world.Area;
import Module2.IslandModel.entities.world.World;

import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

public class OrganismWorker implements Runnable {

    private final String organismType;
    private final World world;
    private final Queue<Task> tasks = new ConcurrentLinkedQueue<>();

    public OrganismWorker(String organismType, World world) {
        this.organismType = organismType;
        this.world = world;
    }

    @Override
    public void run() {
        Area[][] areas = world.getAreas();
        for (Area[] rows : areas) {
            for (Area area : rows) {
                createTasksForArea(area);
            }
        }
    }


    private void createTasksForArea(Area area) {
        Set<Organism> organisms = area.getInhabitants().get(organismType);
        if (organisms != null) {
            area.getLock().lock();
            try {
                for (Organism organism : organisms) {
                    tasks.add(new Task(organism, area));
                }
            } finally {
                area.getLock().unlock();
            }
        }

        tasks.forEach(Task::perform);
        tasks.clear();
    }

}
