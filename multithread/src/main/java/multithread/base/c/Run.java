package multithread.base.c;

/**
 * Created by mlh on 2017/12/19.
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
    }
}
