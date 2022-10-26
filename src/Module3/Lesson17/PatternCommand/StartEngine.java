package Module3.Lesson17.PatternCommand;

/**
 * Реализуем интерфейс Command классом StartEngine, который будет непосредственно управлять запуском двигателя
 */

class StartEngine implements Command{  // ЭТО И ЕСТЬ КОМАНДА, ЕЙ МОЖЕТ БЫТЬ ВСЕ ЧТО УГОДНО В КОНТЕКСТЕ ЛОГИКИ ПРИЛОЖЕНИЯ
    private Engine engine;

    public StartEngine(Engine engine){
        this.engine = engine;
    }

    @Override
    public void doComand() {
        engine.start();
    }
}