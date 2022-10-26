package Module3.Lesson17.PatternMediator;

public class Solution {
    public static void main(String[] args) {

        // КЛАССИЧЕСКИЙ СОПОСОБ
        Engine engine = new Engine();
        Car car = new Car();
        car.setEngine(engine);

        // ЧЕРЕЗ МЕДИАТОР

        Engine engine1 = new Engine();
        Car car1 = new Car();

        // НО САМИ ВЫШЕОПИСАННЫЕ ОБЪЕКТЫ МОГУТ БЫТЬ ПОРОЖДЕНЫ И ВЗЯЛИ ГДЕ-УГОДНО И ОТКУДА УГОДНО,
        // МЫ НЕ ИСПОЛЬЗУЕМ КОНСТРУКТОР КЛАССА Car, МЫ ПОЛЬЗУЕМСЯ СЕТТЕРОМ КОТОРЫЙ ВЫЗЫВАЕТСЯ ЧЕРЕЗ МЕДИАТОР

        Mediator.injectEngine(car1, engine1);

    }
}
