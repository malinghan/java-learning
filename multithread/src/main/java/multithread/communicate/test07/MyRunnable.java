package multithread.communicate.test07;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/31
 * @description:测试wait(long)
 */
public class MyRunnable {
        static private Object lock = new Object();//lock static

        static private Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (lock) {
                        System.out.println("wait begin timer="
                                + System.currentTimeMillis());
                        lock.wait(5000);//wait(5000)
                        System.out.println("wait   end timer="
                                + System.currentTimeMillis());
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };


        static private Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("notify begin timer="
                            + System.currentTimeMillis());
                    lock.notify();//notify
                    System.out.println("notify   end timer="
                            + System.currentTimeMillis());
                }
            }
        };

        public static void main(String[] args) throws InterruptedException {
            Thread t1 = new Thread(runnable1);
            t1.start();
            Thread.sleep(9000);
            Thread t2 = new Thread(runnable2);
            t2.start();
        }

    }
