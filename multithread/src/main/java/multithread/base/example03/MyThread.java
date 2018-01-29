package multithread.base.example03;

/**
 * Created by mlh on 2017/12/18.
 */
public class MyThread extends Thread{
    private  int i=5;

    @Override
    public void run() {
        System.out.println(
                "i="+(i--)+"threadName="+Thread.currentThread().getName());
    }
}
