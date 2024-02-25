package multithread.deadlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2022-03-20
 * 1. 互斥条件：定义2个对象
 * 2. 定义2个线程
 * 3. 循环等待：同时基于 这2个对象，按不同的顺序加锁
 * 4. 不可剥夺、请求保持: while
 */
public class ReentryLockDeadLockDemo  {
    static ReentrantLock lock1 = new ReentrantLock();
    static ReentrantLock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        ReentryLockDeadLockDemo demo1 = new ReentryLockDeadLockDemo();
        ReentryLockDeadLockDemo demo2 = new ReentryLockDeadLockDemo();
        Thread thread1 = new Thread(demo1::method1);
        Thread thread2 = new Thread(demo2::method2);
        thread1.start();
        thread2.start();
    }

    public void method1() {
        //        while(true) {
        lock1.lock();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock2.lock();
        System.out.println("2");
        lock2.unlock();
        lock1.unlock();
        //        }
    }

    public void method2() {
        //        while(true) {
        lock2.lock();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock1.lock();
        System.out.println("1");
        lock1.unlock();
        lock2.unlock();
        //                }
    }
}
//
//    Found one Java-level deadlock:
//        =============================
//        "Thread-1":
//        waiting to lock monitor 0x00007fc41a84f0a8 (object 0x000000076ac85f40, a java.lang.Object),
//        which is held by "Thread-0"
//        "Thread-0":
//        waiting to lock monitor 0x00007fc41a84c818 (object 0x000000076ac85f50, a java.lang.Object),
//        which is held by "Thread-1"

