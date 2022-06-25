package Module2.Lesson9;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {


        //Создаем машинки
        Car vw = new Car("VW", 150, new Engine(543));
        Car toyota = new Car("Toyota", 150, new Engine(543));

        //Клонируем машинку
        Car cloneCar = (Car) vw.clone();

        //Добавляем машинки в HashSet
        Set<Car> hSet = new HashSet<>();
        hSet.add(vw);
        hSet.add(toyota);


        //Добавляем машинки в TreeSet
        Set<Car> tSet = new TreeSet<>();
        tSet.add(vw);
        tSet.add(toyota);

        System.out.println("Сколько объектов в HashSet");
        System.out.println(hSet.size());

        //Смотрим на размер трисета
        System.out.println("Сколько объектов в TreeSet:");
        System.out.println(tSet.size());
        //Понимаем, что-то идет не так

        //Меняем одно поле в vw
        vw.model = "Жигули!";

        //Смотрим, найдутся-ли обе машинки теперь в hashSet
        System.out.println("Есть ли в hashSet vw и toyota?");
        System.out.println(hSet.contains(vw) + " " + hSet.contains(toyota));

        //Смотрим, найдутся ли обе машинки в TreeSet, и удивляемся
        System.out.println("Есть ли в TreeSet vw и toyota?");
        System.out.println(tSet.contains(vw) + " " + tSet.contains(toyota));


    }
}
