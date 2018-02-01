package multithread.communicate.test03;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/30
 * @description:waitReleaseLock
 */

/**
 *
 */
public class Service {

    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait()");
                lock.wait();
                System.out.println("  end wait()");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
