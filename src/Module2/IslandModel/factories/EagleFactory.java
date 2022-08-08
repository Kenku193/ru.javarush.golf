package Module2.IslandModel.factories;

import Module2.IslandModel.entities.organisms.Organism;
import Module2.IslandModel.entities.organisms.animals.predators.Eagle;

public class EagleFactory implements OrganismFactory{
    @Override
    public Organism createOrganism() {
        return new Eagle();
    }
}
