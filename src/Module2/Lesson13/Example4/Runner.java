package Module2.Lesson13.Example4;

import java.util.concurrent.*;

public class Runner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //  Runnable runnable = () -> System.out.println(Thread.currentThread().getName());

        ThreadGroup group = new ThreadGroup("group");



        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("Fuck you!");
            }
        };

        Thread th1 = new Thread(group, run);


        StringBuffer stringBuffer = new StringBuffer();

        Callable<StringBuffer> callable = () -> {

            for (int i = 0; i < 50; i++) {
                stringBuffer.append(i);

            }
            return stringBuffer;
        };


        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit((Runnable) th1);


        //  System.out.println(executorService.submit(callable).get());


        //  Future<StringBuffer> submit = executorService.submit(callable);
        //   System.out.println(submit.get());


        executorService.shutdown();


    }
}