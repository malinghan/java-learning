package multithread.base.sameNum;

/**
 * Created by mlh on 2017/12/18.
 */
public class MyThread extends Thread{
    private  int i=5;

    @Override
    public void run() {
        System.out.println("threadName="+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        multithread.base.MyThread run = new multithread.base.MyThread();
        Thread t1=new Thread(run);
        Thread t2=new Thread(run);
        Thread t3=new Thread(run);
        Thread t4=new Thread(run);
        Thread t5=new Thread(run);
        t1.run();
        t2.run();
        t3.run();
        t4.run();
        t5.run();
    }
}
