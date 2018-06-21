package multithread.lock.test13;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/9
 * @description:
 */
public class Service {
    public ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod() {
        try {
            lock.lock();
            System.out
                    .println("lock begin " + Thread.currentThread().getName());

            for (int i = 0; i < Integer.MAX_VALUE / 10; i++) {
                String newString = new String();
                Math.random();
            }

            System.out
                    .println("lock   end " + Thread.currentThread().getName());
        } finally {
            //判断lock是否被当前线程持有
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }
}
