package Module2.IslandModel;


import Module2.IslandModel.entities.Game;
import Module2.IslandModel.entities.settings.Initializer;
import Module2.IslandModel.entities.world.World;
import Module2.IslandModel.services.GameWorker;

public class Runner {
    public static void main(String[] args) {

        Initializer initializer = new Initializer();
        World world = initializer.createWorld();
        Game game = new Game(world);
        GameWorker gameWorker = new GameWorker(game);
        gameWorker.start();

    }
}
