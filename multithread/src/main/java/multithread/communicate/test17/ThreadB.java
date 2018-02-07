package multithread.communicate.test17;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/6
 * @description:
 */
public class ThreadB extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("   b run begin timer="
                    + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("   b run   end timer="
                    + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void bService() {
        System.out.println("bService timer=" + System.currentTimeMillis());
    }

}