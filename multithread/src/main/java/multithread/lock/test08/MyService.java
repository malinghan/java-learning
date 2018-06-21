package multithread.lock.test08;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/9
 * @description:
 */
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private volatile int i=0;
    //private boolean hasValue = false;

    public void set() {
        try {
            lock.lock();
            while (i==5) {
            //while (hasValue) {
                condition.await();
            }
            System.out.println("打印★");
            //hasValue = true;
            i++;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void get() {
        try {
            lock.lock();
            while (i==0) {
            //while (!hasValue) {
                condition.await();
            }
            System.out.println("打印☆");
            i--;
            //hasValue = false;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
