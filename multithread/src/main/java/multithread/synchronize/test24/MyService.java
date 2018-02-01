package multithread.synchronize.test24;


import java.util.concurrent.atomic.AtomicLong;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/29
 * @description:
 */

/**
 * 原子类并非完全线程安全：方法是原子的
 * 但是方法和方法之间不是原子的 入 addAndGet(100) he addAndGet(1) 之间并不是原子的
 */
public class MyService  extends  Thread{
    public static AtomicLong aiRef=new AtomicLong();

    public void addNum(){
        System.out.println(Thread.currentThread().getName()+"airef+100="+aiRef.addAndGet(100));
        aiRef.addAndGet(1);

    }

    @Override
    public void run() {
        addNum();
    }

    public static void main(String[] args) {
        try {
            MyService s=new MyService();
            MyThread [] array= new MyThread[100];
            for (int i = 0; i < 100; i++) {
                array[i]=new MyThread(s);
            }
            for (int i = 0; i < 100; i++) {
                array[i].start();

            }
            Thread.sleep(1000);
            System.out.println(s.aiRef.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
