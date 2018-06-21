package multithread.lock.test13;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/9
 * @description:
 */
public class Service4 {
    public ReentrantLock lock = new ReentrantLock();

    public void waitMethod() {
        try {
            //3秒内如果锁释放了，且当前线程未被中断，则获取锁
            if (lock.tryLock(3, TimeUnit.SECONDS)) {
                System.out.println("      " + Thread.currentThread().getName()
                        + "获得锁的时间：" + System.currentTimeMillis());
                Thread.sleep(10000);
            } else {
                System.out.println("      " + Thread.currentThread().getName()
                        + "没有获得锁"+ System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }
}
