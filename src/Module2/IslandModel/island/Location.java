package Module2.IslandModel.island;



import Module2.IslandModel.animals.herbivores.Herbivore;
import Module2.IslandModel.animals.predators.Predator;
import Module2.IslandModel.plants.Plant;

import java.util.ArrayList;
import java.util.List;

public class Location {


    // Списки где будут хранитсья находящиеся на локации сущности
    List<Herbivore> herbivores = new ArrayList<>();
    List<Predator> predators = new ArrayList<>();
    List<Plant> plants = new ArrayList<>();


    // ОПИСЫВАЕМ СОБЫТИЯ НА ЛОКАЦИИ
    public void calculate() {

        // В ЦИКЛЕ ПЕРЕБИРАЕМ ХИЩНИКОВ ИЗ ЛИСТА
        // И КАЖДОМУ ПО ОЧЕРЕДИ СУЕМ СПИСОК ТРАВОЯДНЫХ
        for (int i = 0; i < predators.size(); i++) {
            Predator predator = predators.get(i);
            predator.eat(herbivores);

            // РАЗМНОЖАЕМСЯ
            predator.breed();

            // ДВИГАЕМСЯ
            predator.chooseDirection();
        }

        // ТО ЖЕ САМОЕ ДЕЛАЕМ ДЛЯ ТРАВОЯДНЫХ

        for (int i = 0; i < herbivores.size(); i++) {
            // ... //
        }
        
    }

    @Override
    public String toString() {
        return " | | ";
    }
}

