package multithread.synchronize.test6;

/**
 * Created by mlh on 2017/12/22.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        Service   service=new Service();
        service.service1();
    }
}
