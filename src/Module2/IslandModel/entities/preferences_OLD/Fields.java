package Module2.IslandModel.entities.preferences_OLD;

public class Fields {

    private final String name;
    private final String icon;
    private final double startWeight;
    private final double maxWeight;
    private final int maxCount;
    private final int maxSpeed;
    private final double maxFood;

    public Fields(String name, String icon, double startWeight, double maxWeight, int maxCount, int maxSpeed, double maxFood) {
        this.name = name;
        this.icon = icon;
        this.startWeight = startWeight;
        this.maxWeight = maxWeight;
        this.maxCount = maxCount;
        this.maxSpeed = maxSpeed;
        this.maxFood = maxFood;
    }

    public String getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }

    public double getStartWeight() {
        return startWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getMaxFood() {
        return maxFood;
    }

    @Override
    public String toString() {
        return "Fields{" +
                "name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                ", startWeight=" + startWeight +
                ", maxWeight=" + maxWeight +
                ", maxCount=" + maxCount +
                ", maxSpeed=" + maxSpeed +
                ", maxFood=" + maxFood +
                '}';
    }
}
