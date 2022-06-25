package Module2.Lesson13.FectoryMethod;

// СБОРОЧНАЯ ЛИНИЯ МАШИН НА ЗАВОДЕ (НАСЛЕДНИК)

class CarsPlant extends Plant{

    @Override
    public Transport createTransport() {

        return new Car();
    }
}

// СБОРОЧНАЯ ЛИНИЯ МОТОЦИКЛОВ НА ЗАВОДЕ (НАСЛЕДНИК)

class MotorcyclesPlant extends Plant{
    @Override
    public Transport createTransport() {
        return new Motorcycle();
    }
}
