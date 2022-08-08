package Module2.IslandModel.entities.settings;

import Module2.IslandModel.creators.WorldCreator;
import Module2.IslandModel.entities.world.World;

public class Initializer {

    public World createWorld() {
        WorldCreator worldCreator = new WorldCreator();
        return worldCreator.createWorld();
    }

}
