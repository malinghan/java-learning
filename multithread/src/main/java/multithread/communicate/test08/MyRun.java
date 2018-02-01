package multithread.communicate.test08;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/31
 * @description: 解决过早唤醒的方法
 * 先执行wait线程，isFirstRunB = false; 再执行notify线程，唤醒wait线程，isFirstRunB = true
 * 先执行notify线程 isFirstRunB = true;再执行wait线程，不用wait。
 */

public class MyRun {

        private String lock = new String("");//lock
        private boolean isFirstRunB = false;//

        private Runnable runnableA = new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (lock) {
                        while (isFirstRunB == false) {//
                            System.out.println("begin wait");
                            lock.wait();//wait
                            System.out.println("end wait");
                        }
                   }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        private Runnable runnableB = new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("begin notify");
                    lock.notify();//notify
                    System.out.println("end notify");
                    isFirstRunB = true;

                }
            }
        };

        public static void main(String[] args) throws InterruptedException {

            MyRun run = new MyRun();

            Thread a = new Thread(run.runnableA);
            a.start();

            Thread.sleep(100);

            Thread b = new Thread(run.runnableB);
            b.start();

        }
    }
/**  wait isFirstRunB=false
 *   notify isFirstRunB=true
 *
 */