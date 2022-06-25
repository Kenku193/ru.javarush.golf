package Module2.Lesson13.Example2;

public class Printer extends Thread{
    @Override
    public void run() {
        try {
            print();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void print() throws InterruptedException {
        synchronized (this){
            for (int i = 0; i < 10; i++) {
                System.out.println(this.getName());
                sleep(0);

            }
        }
    }
}
