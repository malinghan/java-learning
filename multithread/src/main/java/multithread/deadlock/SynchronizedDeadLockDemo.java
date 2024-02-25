package multithread.deadlock;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2022-03-20
 * 1. 互斥条件：定义2个对象
 * 2. 定义2个线程
 * 3. 循环等待：同时基于 这2个对象，按不同的顺序加锁
 * 4. 不可剥夺、请求保持: while
 */
public class SynchronizedDeadLockDemo  {
    static Object o1 = new Object();
    static Object o2 = new Object();

    public static void main(String[] args) {
        SynchronizedDeadLockDemo demo1 = new SynchronizedDeadLockDemo();
        SynchronizedDeadLockDemo demo2 = new SynchronizedDeadLockDemo();
        Thread thread1 = new Thread(demo1::method1);
        Thread thread2 = new Thread(demo2::method2);
        thread1.start();
        thread2.start();
    }

    public void method1() {
//        while(true) {
            synchronized (o1) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                synchronized (o2) {
                    System.out.println("2");
                }
            }
//        }
    }

    public void method2() {
        while(true) {
            synchronized (o2) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                synchronized (o1) {
                    System.out.println("1");
                }
            }
        }
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

