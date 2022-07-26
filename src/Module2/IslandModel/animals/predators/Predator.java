package Module2.IslandModel.animals.predators;



import Module2.IslandModel.animals.Animal;
import Module2.IslandModel.animals.herbivores.Herbivore;

import java.util.List;

public abstract class Predator extends Animal {

    public abstract void eat(List<Herbivore> herbivores);

}
