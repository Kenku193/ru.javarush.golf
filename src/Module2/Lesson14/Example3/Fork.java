package Module2.Lesson14.Example3;

import java.util.concurrent.*;

public class Fork {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // СОЗДАЕМ ЭКЗЕКЬЮТОР C КОЛИЧЕСТВОМ ПОТОКОВ РАВНЫМ ДОСТУПНОМУ JVM
        // ЕСЛИ НЕ ИЗМЕНЕНО ПРИ СТАРТЕ JVM, РАВНО КОЛ-ВУ ЯДЕР ЦП
        ExecutorService myExecutor = Executors.newWorkStealingPool();

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

        }




        // ПРИЗЫВАЕМ НАШ ЭКЗЕКЬЮТОР ЗАВЕРШИТЬСЯ
        myExecutor.shutdown();
    }
}
