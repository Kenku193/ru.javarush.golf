package Module2.Lesson14.Example3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Fixed {

    public static void main(String[] args) throws Exception {

        // СОЗДАЕМ ЭКЗЕКЬЮТОР С ФИКСИРОВАННЫМ КОЛИЧЕСТВОМ ПОТОКОВ
       ExecutorService myExecutor = Executors.newFixedThreadPool(4);

        // ПОТОК ДЛЯ ПРИМЕРА - БОЛЬШОЕ ВЫЧИСЛЕНИЕ И СЛИП
        Thread t = new Thread(){
            @Override
            public void run() {

                try {

                    sleep(500);
                    System.out.println(Thread.currentThread().getName() + " " + Integer.MAX_VALUE * Long.MAX_VALUE + (Long.MAX_VALUE - Double.MIN_VALUE));

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };




        // ЗАГОНЯЕМ В НАШ ЭКЗЕКЬЮТОР t 50 РАЗ
        for (int i = 0; i < 50; i++) {

            myExecutor.execute(t);
        }

        // ПРИЗЫВАЕМ НАШ ЭКЗЕКЬЮТОР ЗАВЕРШИТЬСЯ
        myExecutor.shutdown();



    }

}
