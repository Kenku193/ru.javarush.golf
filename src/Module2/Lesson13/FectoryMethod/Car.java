package Module2.Lesson13.FectoryMethod;

import java.util.ArrayList;
import java.util.List;

class Car implements Transport{
    String name;
    List<String> accessories = new ArrayList();
    public Car(){
        name = "Машинка";
        accessories.add("Панорамная крыша");
        accessories.add("Климат-контроль");
        accessories.add("Кожаный салон");
        accessories.add("Кожаный мешок");
    }

    @Override
    public String toString() {
        return "Transport type: " + name + "\n" + accessories;
    }
}

class Motorcycle implements Transport{
    String name;
    List<String> accessories = new ArrayList();
    public Motorcycle(){
        name = "Мотоциклик";
        accessories.add("Аптечка");
        accessories.add("Шлем");
        accessories.add("Бланк завещания");
    }
    @Override
    public String toString() {
        return "Transport type: " + name + "\n" + accessories;
    }

}


