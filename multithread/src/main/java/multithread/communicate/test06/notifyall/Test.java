package multithread.communicate.test06.notifyall;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/31
 * @description:通知一个或通知全部waiting线程
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();

        ThreadA a = new ThreadA(lock);
        a.start();

        ThreadB b = new ThreadB(lock);
        b.start();

        ThreadC c = new ThreadC(lock);

        c.start();

        Thread.sleep(1000);

        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();

    }

}
