package Module2.IslandModel.entities.preferences_OLD;

import Module2.IslandModel.entities.Organisms;

import java.util.HashMap;
import java.util.Map;

public class GamePreferences {

    // СИНГЛТОН

    private Map<Organisms, Fields> preferences = new HashMap<>(); // СТРУКТУРИРОВАННО ХРАНЯТСЯ НАСТРОЙКИ ДЛЯ КАЖДОГО ИЗ НАШИХ КЛАССОВ

    private static final GamePreferences instance = new GamePreferences();

    private GamePreferences() { initialize(); } // ОБХОДИМСЯ БЕЗ ЛЕНИВОЙ ИНИЦИАЛИЗАЦИИ, ИСПОЛЬЗУЕМ ОБЫЧНУЮ

    private void initialize() {

        preferences.put(Organisms.WOLF, new Fields("Волк", "\uD83D\uDC3A", 46, 50, 30, 3, 8));
        preferences.put(Organisms.SNAKE, new Fields("Удав", "\uD83D\uDC0D", 12, 15, 30, 1, 3));
        preferences.put(Organisms.FOX, new Fields("Лиса", "\uD83E\uDD8A", 6, 8, 30, 2, 2));
        preferences.put(Organisms.BEAR, new Fields("Медведь", "-", 450, 500, 5, 2, 80));
        preferences.put(Organisms.TURKANDJD, new Fields("Орел", "-", 5, 6, 20, 3, 1));
        preferences.put(Organisms.HORSE, new Fields("Лошадь", "-", 350, 400, 20, 4, 60));
        preferences.put(Organisms.DEER, new Fields("Олень", "-", 260, 300, 20, 4, 50));
        preferences.put(Organisms.RABBIT, new Fields("Кролик", "-", 1.8, 2, 150, 2, 0.45));
        preferences.put(Organisms.MOUSE, new Fields("Мышь", "-", 0.04, 0.05, 500, 1, 0.01));
        preferences.put(Organisms.GOAT, new Fields("Коза", "-", 50, 60, 140, 3, 10));
        preferences.put(Organisms.SHEEP, new Fields("Овца", "-", 60, 70, 140, 3, 15));
        preferences.put(Organisms.BOAR, new Fields("Кабан", "-", 350, 400, 50, 2, 50));
        preferences.put(Organisms.BUFFALO, new Fields("Буйвол", "-", 600, 700, 10, 3, 100));
        preferences.put(Organisms.DUCK, new Fields("Утка", "-", 0.8, 1, 200, 4, 0.15));
        preferences.put(Organisms.CATERPILLAR, new Fields("Гусеница", "-", 0.009, 0.01, 1000, 0, 0));
        preferences.put(Organisms.PLANT, new Fields("Растение", "", 1, 1, 200, 0, 0));

    }

    public static GamePreferences getInstance() {return  instance;}


    public Map<Organisms, Fields> getMap() {
        return preferences;
    }

}
