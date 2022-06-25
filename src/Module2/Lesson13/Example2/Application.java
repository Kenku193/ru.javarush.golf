package Module2.Lesson13.Example2;

public class Application {
    public static void main(String[] args) {


        Printer printer0 = new Printer();
        Printer printer1 = new Printer();
        Printer printer2 = new Printer();

        printer0.setPriority(Thread.MAX_PRIORITY);
        printer1.setPriority(Thread.MIN_PRIORITY);
        printer2.setPriority(Thread.MIN_PRIORITY);

        printer0.start();
        printer1.start();
        printer2.start();

    }
}