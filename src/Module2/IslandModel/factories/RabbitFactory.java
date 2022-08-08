package Module2.IslandModel.factories;

import Module2.IslandModel.entities.organisms.Organism;
import Module2.IslandModel.entities.organisms.animals.herbivores.Rabbit;

public class RabbitFactory implements OrganismFactory
{
    @Override
    public Organism createOrganism() {
        return new Rabbit();
    }
}
