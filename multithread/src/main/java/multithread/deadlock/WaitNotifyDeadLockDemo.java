package multithread.deadlock;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2022-03-20
 * 这个不算死锁，属于是waiting的无限等待
 * 1. 互斥条件： Object o1
 * 2. 一直处于waiting状态
 */
public class WaitNotifyDeadLockDemo {

    public static void main(String[] args) {
        WaitNotifyDeadLockDemo waitNotifyDeadLockDemo = new WaitNotifyDeadLockDemo();
        Thread thread1 = new Thread(waitNotifyDeadLockDemo::take);
        Thread thread2 = new Thread(waitNotifyDeadLockDemo::offer);
        thread1.start();
        thread2.start();
    }


    public static Object obj = null;

    public void take() {
         if (obj == null) {
             try {
                 Thread.sleep(5000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             synchronized (this) {
                 try {
                     System.out.println("1. waiting for:" + Thread.currentThread().getId());
                     this.wait();
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
         }
        System.out.println("2. get obj");
    }

    public void offer() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj = new Object();
        synchronized (this) {
            this.notifyAll();
            System.out.println("3 consumer");
        }
    }
}
