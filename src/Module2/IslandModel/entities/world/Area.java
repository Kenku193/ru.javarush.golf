package Module2.IslandModel.entities.world;

import Module2.IslandModel.entities.organisms.Organism;
import Module2.IslandModel.entities.organisms.OrganismsCommonSpecs;
import Module2.IslandModel.entities.settings.Settings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Area {

    private Map<String, Set<Organism>> inhabitants;
    private List<Area> nearestAreas;
    private final Lock lock = new ReentrantLock(true);

    public Map<String, Set<Organism>> getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(Map<String, Set<Organism>> inhabitants) {
        this.inhabitants = inhabitants;
    }

    public List<Area> getNearestAreas() {
        return nearestAreas;
    }

    public void setNearestAreas(List<Area> nearestAreas) {
        this.nearestAreas = nearestAreas;
    }

    public Lock getLock() {
        return lock;
    }

    @Override
    public String toString() {
        HashMap<String, Long> areaStatistics = new HashMap<>();


        inhabitants.entrySet()
                   .forEach(entry -> {

                    OrganismsCommonSpecs organismCommonSpecs = Settings.get().getOrganismCommonSpecsByType(entry.getKey());

                    String icon = organismCommonSpecs.getIcon();

                    long count = entry.getValue().size();

                    areaStatistics.put(icon, count);

                });

        return areaStatistics.toString();
    }

    public void addInhabitant(String organismType, Organism newPlant) {
        inhabitants.get(organismType).add(newPlant);
    }

}
