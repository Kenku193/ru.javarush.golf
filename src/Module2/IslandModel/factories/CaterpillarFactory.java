package Module2.IslandModel.factories;

import Module2.IslandModel.entities.organisms.Organism;
import Module2.IslandModel.entities.organisms.animals.herbivores.Caterpillar;

public class CaterpillarFactory implements OrganismFactory{
    @Override
    public Organism createOrganism() {
        return new Caterpillar();
    }
}
