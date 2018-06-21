package multithread.lock.test06;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/9
 * @description:
 */
public class ThreadB extends Thread {

    private MyService service;

    public ThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitB();
    }
}