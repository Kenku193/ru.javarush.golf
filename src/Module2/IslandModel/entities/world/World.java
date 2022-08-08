package Module2.IslandModel.entities.world;

public class World {
    private final Area[][] areas;

    public World(int rows, int cols) {
        areas = new Area[rows][cols];
    }

    public Area[][] getAreas() {
        return areas;
    }
}
