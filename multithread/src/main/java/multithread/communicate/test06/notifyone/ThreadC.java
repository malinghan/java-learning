package multithread.communicate.test06.notifyone;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/31
 * @description:
 */
public class ThreadC extends Thread {
    private Object lock;

    public ThreadC(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }

}

