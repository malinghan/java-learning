package multithread.lock.test07;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/9
 * @description:消费者线程
 */
public class ThreadB extends Thread {

    private MyService myService;

    public ThreadB(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            myService.get();
        }
    }

}