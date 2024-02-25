package multithread.base;

/**
 * Created by mlh on 2017/12/17.
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        super.run();
        System.out.println("myThread");
    }
}
