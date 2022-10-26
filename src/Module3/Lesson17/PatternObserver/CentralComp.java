package Module3.Lesson17.PatternObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * БОРТОВОЙ КОМПЬЮЕТР АВТО
 */

class CentralComp implements Notifier{ // УВЕДОМИТЕЛЬ - ТОТ КТО СООБЩАЕТ ЧТО-ТО НАБЛЮДАТЕЛЯМ
    private List observers;    // СПИСОК НАБЛЮДАТЕЛЕЙ
    private int speed;      // ПОКАЗАНИЯ СКОРОСТИ
    private int rpm;        // ОБОРОТЫ ДВИГАТЕЛЯ
    private int oilPressure;    // ДАВЛЕНИЕ МАСЛА

    public CentralComp(){
        observers = new ArrayList();
    }

    public void addObserver(Observer obs) {  // ДОБАВЛЕНИЕ НАБЛЮДАТЕЛЯ
        observers.add(obs);
    } // ДОБАВЛЕНИЕ НАБЛЮДАТЕЛЯ

    public void removeObserver(Observer obs) {  // УДАЛЕНИЕ НАБЛЮДАТЕЛЯ
        int i = observers.indexOf(obs);
        if (i >= 0){
            observers.remove(i);
        }
    }

    public void notifyObserver() {                      // УВЕДОМЛЕНИЕ НАБЛЮДАТЕЛЕЙ
        for (int i = 0; i < observers.size(); i++){
            Observer obs = (Observer)observers.get(i);
            obs.update(speed, rpm, oilPressure);
        }
    }

    public void changeData(int speed, int rpm, int oilPressure){    // МЕТОД ДЛЯ ВНЕСЕНИЯ ИЗМЕНЕНИЙ В ПОКАЗАНИЯ АВТО
        this.speed = speed;
        this.rpm = rpm;
        this.oilPressure = oilPressure;
        notifyObserver();       // УВЕДОМЛЯЕМ НАБЛЮДАТЕЛЕЙ ОБ ИЗМЕНЕНИЯХ
    }

}
