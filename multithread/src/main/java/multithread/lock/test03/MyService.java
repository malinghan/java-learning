package multithread.lock.test03;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/8
 * @description:
 */
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await() {
        try {
            //lock.lock();
            condition.await();
            //lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
