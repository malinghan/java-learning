package art.demo2;

import art.util.SleepUtil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author: linghan.ma
 * @DATE: 2018/7/3
 * @description:
 */
public class WaitNotify {
    static boolean flag = true;
    static Object lock = new Object();

    public static void main(String args[]) throws  Exception{
        //
        Thread waitThread = new Thread(new Wait(),"WaitThread");

        waitThread.start();

        TimeUnit.SECONDS.sleep(1);//让wait线程充分启动

        Thread notifyThread = new Thread(new Notify(),"NotifyThread");

        notifyThread.start();
    }

    static  class Wait implements  Runnable{
        public void run(){
            synchronized (lock){
                while (flag){
                    try {
                        System.out.println(Thread.currentThread()+"flag is true. wait@"+new SimpleDateFormat(("HH:mm:ss")).format(new Date()));
                        lock.wait();
                        System.out.println(Thread.currentThread()+"flag is false. afterWaiting@"+new SimpleDateFormat(("HH:mm:ss")).format(new Date()));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                System.out.println(Thread.currentThread()+"flag is false. Running@"+new SimpleDateFormat(("HH:mm:ss")).format(new Date()));
            }

        }
    }

    static class Notify implements  Runnable{
        @Override
        public void run() {
            synchronized (lock) {
                while (flag) {
                    System.out.println(Thread.currentThread() + "flag is true. notify@" + new SimpleDateFormat(("HH:mm:ss")).format(new Date()));
                    lock.notifyAll();
                    flag = false;
                    SleepUtil.second(5);
                }
            }
            //再次加锁
            synchronized (lock){
                System.out.println(Thread.currentThread() + "hold lock again. sleep[@" + new SimpleDateFormat(("HH:mm:ss")).format(new Date()));
                SleepUtil.second(5);
            }
        }

    }


}
