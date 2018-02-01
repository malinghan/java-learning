package multithread.communicate.test03;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/30
 * @description:
 */
public class ThreadA  extends Thread{

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
