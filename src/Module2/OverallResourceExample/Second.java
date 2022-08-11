package Module2.OverallResourceExample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Second implements Runnable{

    private Resource resource;
    private Lock lock;

    public Second(Resource r, ReentrantLock lock){
        this.resource = r;
        this.lock = lock;
    }

    @Override
    public void run() {
      lock.lock();
        try {
            resource.doBad();
        }
        finally{
          lock.unlock();
        }

    }
}
