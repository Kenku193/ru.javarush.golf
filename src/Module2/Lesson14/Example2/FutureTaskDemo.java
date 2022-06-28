package Module2.Lesson14.Example2;

import java.util.concurrent.*;

public class FutureTaskDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // С JAVA 8+ МОЖНО ИСПОЛЬЗОВАТЬ ЛЯМБДЫ
        // Callable<Integer> callTh = () -> {sleep(500); return 500;}

        Callable<Integer> callTh = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(5000);
                return 500;
            }
        };

        // FUTURETASK (НАСЛЕДНИК FUTURE) В БЕЗ ЭКЗЕКЬЮТОРА, ЕГО НАДО ЗАПУСКАТЬ ПЕРЕДАВ CALLABLE

        FutureTask<Integer> task = new FutureTask<>(callTh);
        task.run();
        try{
            System.out.println("Result: " + task.get());
        }
        catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }



        // ПРОСТОЙ FUTURE В КОТОРЫЙ ПРИХОДИТ ПОТОК ИЗ ЭКЗЕКЬЮТОРА
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        Future<Integer> submit = executorService.submit(callTh);
//        System.out.println(submit.get());
    }
}
