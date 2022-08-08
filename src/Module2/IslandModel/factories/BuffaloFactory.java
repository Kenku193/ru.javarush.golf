package Module2.IslandModel.factories;

import Module2.IslandModel.entities.organisms.Organism;
import Module2.IslandModel.entities.organisms.animals.herbivores.Buffalo;

public class BuffaloFactory implements OrganismFactory{
    @Override
    public Organism createOrganism() {
        return new Buffalo();
    }
}
