package multithread.lock.test10;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/9
 * @description:
 */
public class Service {

    public ReentrantLock lock = new ReentrantLock();
    private Condition newCondition = lock.newCondition();

    public void serviceMethod1() {
        try {
            lock.lock();
            System.out.println("serviceMethod1 getHoldCount="
                    + lock.getHoldCount());
            serviceMethod2();
        } finally {
            lock.unlock();
        }
    }

    public void serviceMethod2() {
        try {
            lock.lock();
            System.out.println("serviceMethod2 getHoldCount="
                    + lock.getHoldCount());//查询当前线程保存锁定的个数，调用lock.lock()的数量
        } finally {
            lock.unlock();
        }
    }

    public void serviceMethod3() {
        try {
            lock.lock();
            System.out.println("ThreadName=" + Thread.currentThread().getName()
                    + "进入方法！");
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void waitMethod() {
        try {
            lock.lock();
            newCondition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void notityMethod() {
        try {
            lock.lock();
            System.out.println("有" + lock.getWaitQueueLength(newCondition)
                    + "个线程正在等待newCondition");
            newCondition.signal();
        } finally {
            lock.unlock();
        }
    }
}
