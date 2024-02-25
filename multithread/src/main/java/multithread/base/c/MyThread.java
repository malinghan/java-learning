package multithread.base.c;

/**
 * Created by mlh on 2017/12/19.
 */
public class MyThread extends   Thread {
    public MyThread(){
        System.out.println("构造方法打印:"+Thread.currentThread().getName());

    }

    @Override
    public void run() {
        System.out.println("run方法的打印："+Thread.currentThread().getName());
    }
}
