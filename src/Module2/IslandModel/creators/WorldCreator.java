package Module2.IslandModel.creators;

import Module2.IslandModel.entities.organisms.Organism;
import Module2.IslandModel.entities.settings.Settings;
import Module2.IslandModel.entities.world.Area;
import Module2.IslandModel.entities.world.World;
import Module2.IslandModel.factories.Factories;
import Module2.IslandModel.util.Randomizer;

import java.util.*;

public class WorldCreator {
    public World createWorld() {
        World world = new World(Settings.get().getMapRows(), Settings.get().getMapCols());
        createAreas(world);
        findNearestAreas(world);

        return world;
    }

    private void createAreas(World world) {
        Area[][] areas = world.getAreas();

        for (int row = 0; row < areas.length; row++) {
            for (int col = 0; col < areas[row].length; col++) {
                areas[row][col] = createRandomArea();
            }
        }
    }

    private Area createRandomArea() {
        Settings settings = Settings.get();
        Map<String, Integer> organismsInitialQuantityMap = settings.getOrganismsInitialQuantity();
        int initialBirthPercent = settings.getInitialBirthPercent();
        Map<String, Set<Organism>> inhabitants = new HashMap<>();

        for (Map.Entry<String, Integer> entry : organismsInitialQuantityMap.entrySet()) {
            String organismType = entry.getKey();
            Integer organismQuantity = entry.getValue();

            Set<Organism> organismSet = new HashSet<>();
            for (int i = 0; i < organismQuantity; i++) {
                if (Randomizer.getProbability(initialBirthPercent)) {
                    organismSet.add(Factories.createOrganismByType(organismType));
                }
            }
            inhabitants.put(organismType, organismSet);
        }

        Area newArea = new Area();
        newArea.setInhabitants(inhabitants);

        return newArea;
    }

    private void findNearestAreas(World world) {
        Area[][] areas = world.getAreas();

        for (int row = 0; row < areas.length; row++) {
            for (int col = 0; col < areas[row].length; col++) {
                List<Area> nearestAreas = new ArrayList<>();

                if (row > 0) {
                    nearestAreas.add(areas[row - 1][col]);
                }
                if (col > 0) {
                    nearestAreas.add(areas[row][col - 1]);
                }
                if (row < areas.length - 1) {
                    nearestAreas.add(areas[row + 1][col]);
                }
                if (col < areas[row].length - 1) {
                    nearestAreas.add(areas[row][col + 1]);
                }

                areas[row][col].setNearestAreas(nearestAreas);
            }
        }
    }

}
