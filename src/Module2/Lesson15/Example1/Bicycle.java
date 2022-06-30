package Module2.Lesson15.Example1;

public class Bicycle {
    private String model;
    private int weight;

    private int diameter;

int seatPostDiameter = 10;

    public Bicycle(String model, int weight, int diameter) {
        this.diameter = diameter;
        this.model = model;
        this.weight = weight;
    }

    public void start() {
        System.out.println("Поехали!");
    }

    public class HandleBar {
        public void right() {
            System.out.println("Руль вправо!");
        }
        public void left() {
            System.out.println("Руль влево!");
        }
    }

    public class Seat {


        public void up() {
            System.out.println("Сиденье поднято выше!");


        }
        public void down() {
            System.out.println("Сиденье опущено ниже!");
        }

        public void getDiameter(){
            System.out.println("Диаметер втулки" + Bicycle.this.diameter);
        }
    }

    public static class Pump{
        public void pumpIt(){
            System.out.println("Pump!Pump!Pump!BADABOOM!");
        }
    }
}
