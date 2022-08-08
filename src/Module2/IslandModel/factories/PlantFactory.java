package Module2.IslandModel.factories;

import Module2.IslandModel.entities.organisms.Organism;
import Module2.IslandModel.entities.organisms.plants.Plant;

public class PlantFactory implements OrganismFactory{
    @Override
    public Organism createOrganism() {
        return new Plant();
    }
}
