package Module2.Lesson14.Example4;


import java.util.concurrent.ArrayBlockingQueue;

public class Q {
    public static void main(String[] args) throws InterruptedException {

        // ОЧЕРЕДЬ НА 2 ЭЛЕМЕНТА
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(2);


        // ПОТОК НА ДОБАВЛЕНИЕ

        new Thread(){

            @Override
            public void run() {
                for (int i = 0; i < 4; i++) {
                    try{
                        arrayBlockingQueue.put("Java " + i);
                        System.out.println("Элемент " + i + " добавлен!");
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        // ПОТОК НА ИЗВЛЕЧЕНИЕ
        new Thread(){

            @Override
            public void run() {
                    try{
                     Thread.sleep(500);
                     // ИЗВЛЕКАЕМ 1 ЭЛЕМЕНТ
                        System.out.println("Элемент " + arrayBlockingQueue.take() + " извлечен!");
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }

        }.start();



    }
}
