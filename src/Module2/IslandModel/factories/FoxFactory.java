package Module2.IslandModel.factories;

import Module2.IslandModel.entities.organisms.Organism;
import Module2.IslandModel.entities.organisms.animals.predators.Fox;

public class FoxFactory implements OrganismFactory{
    @Override
    public Organism createOrganism() {
        return new Fox();
    }
}
