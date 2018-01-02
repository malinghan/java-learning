package multithread.synchronize.test7;


/**
 * Created by mlh on 2017/12/22.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        Sub   sub=new Sub();
        sub.operatorISubMethod();
    }
}
