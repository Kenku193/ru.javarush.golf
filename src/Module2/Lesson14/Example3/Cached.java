package Module2.Lesson14.Example3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Cached {
    public static void main(String[] args) {
        // СОЗДАЕМ ЭКЗЕКЬЮТОР C КОЛИЧЕСТВОМ ПОТОКОВ - ДАННЫЙ ThreadPool РЕГУЛИРУЕТ КОЛ-ВО ДИНАМИЧЕСКИ
        ExecutorService myExecutor = Executors.newCachedThreadPool();

        // ПОТОК ДЛЯ ПРИМЕРА - БОЛЬШОЕ ВЫЧИСЛЕНИЕ И СЛИП
        Thread t = new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " " + Integer.MAX_VALUE * Long.MAX_VALUE + (Long.MAX_VALUE - Double.MIN_VALUE));
                try {
                    sleep(500);
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
