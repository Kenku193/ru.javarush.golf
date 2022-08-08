package Module2.IslandModel.factories;

import Module2.IslandModel.entities.organisms.Organism;
import Module2.IslandModel.entities.organisms.animals.herbivores.Sheep;

public class SheepFactory implements OrganismFactory{
    @Override
    public Organism createOrganism() {
        return new Sheep();
    }
}
