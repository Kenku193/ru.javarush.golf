package Module2.IslandModel.factories;

import Module2.IslandModel.entities.organisms.Organism;
import Module2.IslandModel.entities.organisms.animals.predators.Boa;

public class BoaFactory implements OrganismFactory{
    @Override
    public Organism createOrganism() {
        return new Boa();
    }
}
