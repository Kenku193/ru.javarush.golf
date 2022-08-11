package Module2.OverallResourceExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {
    public static void main(String[] args) {
        Resource resource = new Resource();
        ReentrantLock locker = new ReentrantLock(); // создаем заглушку


        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(new First(resource, locker));
        executorService.submit(new Second(resource, locker));
    }
}
