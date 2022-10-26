package Module3.Lesson17.PatternObserver;
/**
 * ПРИБОРНАЯ ПАНЕЛЬ АВТО
 */
class Dashboard implements Observer{  // СЛУШАТЕЛЬ ИЛИ НАБЛЮДАТЕЛЬ
    private Notifier notifier;
    private int speed;
    private int rpm;
    private int oilPressure;

    public Dashboard(Notifier notifier){
        this.notifier = notifier;
        notifier.addObserver(this); // РЕГИСТРИРУЕМ НАБЛЮДАТЕЛЯ В УВЕДОМИТЕЛЕ
    }

    public void update(int speed, int rpm, int oilPressure) {
        this.speed = speed;
        this.rpm = rpm;
        this.oilPressure = oilPressure;
        show();


    }

    public void show(){
        System.out.println("Speed = " + speed + ", RPM = " + rpm +
                ", Oil pressure = " + oilPressure);

    }

}
