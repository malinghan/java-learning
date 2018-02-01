package multithread.communicate.test03;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/30
 * @description:
 */
public class ThreadB extends Thread{
    private Object lock;

    public ThreadB(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
