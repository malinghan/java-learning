package multithread.lock.test02;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/8
 * @description:
 */
public class ThreadBB extends Thread {

    private MyService service;

    public ThreadBB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}