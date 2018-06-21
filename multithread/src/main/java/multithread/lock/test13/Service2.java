package multithread.lock.test13;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/9
 * @description:lock.lockInterruptibly();
 */
public class Service2 {

    public ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod() {
        try {
            lock.lockInterruptibly(); //@throws InterruptedException if the current thread is interrupted
            System.out.println("lock " + Thread.currentThread().getName());
            for (int i = 0; i < Integer.MAX_VALUE / 10; i++) {
                String newString = new String();
                Math.random();
            }
        } catch (InterruptedException e) {
            System.out.println(" "+Thread.currentThread().getName()+" catch~!");
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }
}
