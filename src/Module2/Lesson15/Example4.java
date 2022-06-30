package Module2.Lesson15;

public class Example4 extends Thread{
    @Override
    public void run() {
        super.run();
    }
}


class Go {
    public static void main(String[] args) {
        Example4 example4 = new Example4();
        example4.start();

    }

}