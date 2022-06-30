package Module2.Lesson15.Example3;



public class Test {
    public static void main(String[] args) {

        Cat cat = new Cat() {
            @Override
            public void run() {

            }

            @Override
            public void eat() {

            }
        };


       Runnable r = new Runnable() {
           @Override
           public void run() {
               System.out.println("xxx");
           }
       };

       Thread t = new Thread(r);
       t.start();

    }
}
