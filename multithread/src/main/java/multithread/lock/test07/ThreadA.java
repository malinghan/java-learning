package multithread.lock.test07;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/9
 * @description:生产者线程
 */
public class ThreadA extends Thread {

    private MyService myService;

    public ThreadA(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            myService.set();
        }
    }

}