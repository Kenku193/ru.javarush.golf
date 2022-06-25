package Module2.Lesson13.Example4;

public class Client extends Thread{

    public Client(int number) {
        super("Client " + number);
    }

    @Override
    public void run() {
        System.out.println(this + " buying something");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(this + " leaves the store");
    }

    @Override
    public String toString() {
        return getName();
    }
}