package multithread.lock.test03;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/8
 * @description:
 */
public class ThreadA extends Thread {

    private MyService service;

    public ThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.await();
    }
}