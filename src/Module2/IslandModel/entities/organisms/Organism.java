package Module2.IslandModel.entities.organisms;

import Module2.IslandModel.entities.organisms.animals.Animal;
import Module2.IslandModel.entities.settings.Settings;
import Module2.IslandModel.entities.world.Area;
import Module2.IslandModel.util.Randomizer;

public abstract class Organism {

    private final String type = this.getClass().getSimpleName();

    private double weight;

    public abstract void multiply(Area area);

    public abstract void growUp(Area area);

    protected Organism() {
        OrganismsCommonSpecs organismsCommonSpecs = Settings.get().getOrganismCommonSpecsByType(this.type);
        this.weight = Randomizer.getRandom(organismsCommonSpecs.getMaxWeight() / 2.0D, organismsCommonSpecs.getMaxWeight());
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getChildQuantity(Area area) {
        Settings settings = Settings.get();
        Integer childrenQuantity = settings.getOrganismsChildrenQuantity().get(getType());
        int maxQuantityInArea = settings.getOrganismCommonSpecsByType(getType()).getMaxQuantity();
        int newBornQuantity = Randomizer.getRandom(0, Math.min(childrenQuantity, maxQuantityInArea));
        int sameOrganismTypeQuantity = area.getInhabitants().get(this.getType()).toArray().length;

        return Math.min(maxQuantityInArea - sameOrganismTypeQuantity, newBornQuantity);
    }

    public void starve(Area area) { safeStarve(area); }

    private void safeStarve(Area area) {
        area.getLock().lock();
        try {
            OrganismsCommonSpecs organismsCommonSpecs = Settings.get().getOrganismCommonSpecsByType(this.getType());
            int weightLossPercent;
            if (this instanceof Animal) {
                weightLossPercent = 20;
            }
            else {
                weightLossPercent = 1;
            }

            double weightLoss = organismsCommonSpecs.getMaxWeight() * weightLossPercent / 100;
            this.setWeight(this.getWeight() - weightLoss);

            if (this.getWeight() < organismsCommonSpecs.getMaxWeight() * 0.3) {
                area.getInhabitants().get(this.getType()).remove(this);
            }
        } finally {
            area.getLock().unlock();
        }
    }

}
