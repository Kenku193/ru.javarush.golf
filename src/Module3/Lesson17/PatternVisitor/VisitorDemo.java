package Module3.Lesson17.PatternVisitor;

import java.util.List;

/**
 * Пример с каршерингом - когда визитер - это сервисный автомобиль, который объезжает каршеринговые машины
 * и добавляет им топливо, в соответствии с типом машины.
 */

public class VisitorDemo {

    public static void main(final String[] args) {
        Car car = new Car();
        car.accept(new CarTypePrintVisitor());
    }

}

// Супертип всех объектов в структуре
interface CarType {

    void accept(CarTypeVisitor visitor);

}

// Супертип всех операций
interface CarTypeVisitor {

    void visit(CheapCar cheapCar);
    void visit(ExpensiveCar expensiveCar);
    void visit(ElectricCar electricCar);

}

class CheapCar implements CarType {

    @Override
    public void accept(CarTypeVisitor visitor) {
        visitor.visit(this);
    }

}

class ElectricCar implements CarType {

    @Override
    public void accept(CarTypeVisitor visitor) {
        visitor.visit(this);
    }

}

class ExpensiveCar implements CarType {

    @Override
    public void accept(CarTypeVisitor visitor) {
        visitor.visit(this);
    }

}

class Car implements CarType{
    private final List<CarType> cars;

    public Car() {
        this.cars = List.of(new ExpensiveCar(), new ElectricCar(), new CheapCar());
    }

    @Override
    public void accept(CarTypeVisitor visitor) {
        for (CarType car : cars) {
            car.accept(visitor);
        }
    }
}

class CarTypePrintVisitor implements CarTypeVisitor {

    @Override
    public void visit(CheapCar cheapCar) {
        System.out.println("Visiting cheap car - added 92 petrol");
    }

    @Override
    public void visit(ExpensiveCar expensiveCar) {
        System.out.println("Visiting expensive car - added 100 petrol");
    }

    @Override
    public void visit(ElectricCar electricCar) {
        System.out.println("Visiting electric car - added electricity");
    }

}