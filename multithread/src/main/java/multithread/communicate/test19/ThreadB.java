package multithread.communicate.test19;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/6
 * @description:
 * B -> sleep(5000)
 */
public class ThreadB extends Thread {

    @Override
    synchronized public void run() {
        try {
            System.out.println("begin B ThreadName="
                    + Thread.currentThread().getName() + "  "
                    + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("  end B ThreadName="
                    + Thread.currentThread().getName() + "  "
                    + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
