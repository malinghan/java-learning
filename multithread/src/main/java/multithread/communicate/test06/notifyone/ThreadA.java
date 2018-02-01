package multithread.communicate.test06.notifyone;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/31
 * @description:
 */
public class ThreadA extends Thread {
    private Object lock;

    public ThreadA(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }

}