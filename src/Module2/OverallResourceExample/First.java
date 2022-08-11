package Module2.OverallResourceExample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class First implements Runnable{

    private Resource resource;
    private Lock lock;

    public First(Resource r, ReentrantLock lock){
        this.resource = r;
        this.lock = lock;
    }

    @Override
    public void run() {
       lock.lock();
        try {
            resource.doSomething();
        }
        finally{

           lock.unlock();
        }

    }

}
