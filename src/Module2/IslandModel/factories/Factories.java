package Module2.IslandModel.factories;

import Module2.IslandModel.entities.organisms.Organism;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Factories {

    private static volatile Factories FACTORIES;
    private final Map<String, OrganismFactory> factoriesMap;

    private Factories() {
        factoriesMap = new HashMap<>();
        //TODO Coding. Hard code. Not flexible. Array??? Or reflection and cfg???
        factoriesMap.put("Bear", new BearFactory());
        factoriesMap.put("Boa", new BoaFactory());
        factoriesMap.put("Eagle", new EagleFactory());
        factoriesMap.put("Fox", new FoxFactory());
        factoriesMap.put("Wolf", new WolfFactory());
        factoriesMap.put("Boar", new BoarFactory());
        factoriesMap.put("Buffalo", new BuffaloFactory());
        factoriesMap.put("Caterpillar", new CaterpillarFactory());
        factoriesMap.put("Deer", new DeerFactory());
        factoriesMap.put("Duck", new DuckFactory());
        factoriesMap.put("Goat", new GoatFactory());
        factoriesMap.put("Horse", new HorseFactory());
        factoriesMap.put("Mouse", new MouseFactory());
        factoriesMap.put("Rabbit", new RabbitFactory());
        factoriesMap.put("Sheep", new SheepFactory());
        factoriesMap.put("Plant", new PlantFactory());
    }

    private static Map<String, OrganismFactory> getFactoriesMap() {
        Factories factories = FACTORIES;
        if (Objects.isNull(factories)) {
            synchronized (Factories.class) {
                if (Objects.isNull(factories = FACTORIES)) {
                    factories = FACTORIES = new Factories();
                }
            }
        }

        return factories.factoriesMap;
    }

    public static Organism createOrganismByType(String organismType) {
        return getFactoriesMap().get(organismType).createOrganism();
    }

}
