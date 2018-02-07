package multithread.communicate.test17;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/6
 * @description:
 */
public class ThreadA extends Thread {

    private ThreadB b;

    public ThreadA(ThreadB b) {
        super();
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b) {
                  b.start();
                Thread.sleep(5000);
                //vvv Thread.sleep()
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
