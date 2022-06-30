package Module2.Lesson15.Example1;

public class Test {
    public static void main(String[] args) {

        Bicycle peugeot = new Bicycle("Peugeot", 120, 10);
        Bicycle.HandleBar handleBar = peugeot.new HandleBar();

        Bicycle.Seat seat = peugeot.new Seat();

        seat.up();
        peugeot.start();
        handleBar.left();
        handleBar.right();

        Bicycle.Pump pump = new Bicycle.Pump();
        pump.pumpIt();

    }
}
