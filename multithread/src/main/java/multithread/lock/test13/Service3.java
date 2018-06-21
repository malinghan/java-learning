package multithread.lock.test13;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/9
 * @description:
 */
public class Service3 {
    public ReentrantLock lock = new ReentrantLock();

    public void waitMethod() {
        if (lock.tryLock()) {//
            System.out.println(Thread.currentThread().getName() + "获得锁");
        } else {
            System.out.println(Thread.currentThread().getName() + "没有获得锁");
        }
    }
}
