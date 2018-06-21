package multithread.lock.test11;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/9
 * @description:
 */
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {

    public ReentrantLock lock = new ReentrantLock();
    public Condition newCondition = lock.newCondition();

    public void waitMethod() {
        try {
            lock.lock();
            newCondition.await();
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void notityMethod() {
        try {
            lock.lock();
            System.out.println("有没有线程正在等待newCondition？"
                    + lock.hasWaiters(newCondition) + "\n 线程数是多少？"
                    + lock.getWaitQueueLength(newCondition));
            newCondition.signal();
        } finally {
            lock.unlock();
        }
    }
}
