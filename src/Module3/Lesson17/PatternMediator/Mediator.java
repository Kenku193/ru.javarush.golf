package Module3.Lesson17.PatternMediator;

public class Mediator {
    public static void injectEngine(Car car, Engine engine){
        car.setEngine(engine);
    }
}
