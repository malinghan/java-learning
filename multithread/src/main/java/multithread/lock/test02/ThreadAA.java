package multithread.lock.test02;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/8
 * @description:
 */
public class ThreadAA extends Thread {

    private MyService service;

    public ThreadAA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodA();
    }
}