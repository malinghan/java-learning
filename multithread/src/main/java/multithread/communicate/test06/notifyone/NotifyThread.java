package multithread.communicate.test06.notifyone;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/31
 * @description:
 */

public class NotifyThread extends Thread {
    private Object lock;

    public NotifyThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            lock.notify();//多次调用
//            lock.notify();
//            lock.notify();
//            lock.notify();
//            lock.notify();
//            lock.notify();
//            lock.notify();
//            lock.notify();
//            lock.notify();
        }
    }

}
