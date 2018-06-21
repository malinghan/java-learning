package multithread.lock.test12;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/9
 * @description:
 */
import java.util.concurrent.locks.ReentrantLock;

public class Service {

    private ReentrantLock lock;

    public Service(boolean isFair) {
        super();
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        try {
            lock.lock();
            System.out.println("公平锁情况：" + lock.isFair());//什么锁
        } finally {
            lock.unlock();
        }
    }

    public void serviceMethod2() {
        try {
            System.out.println(lock.isHeldByCurrentThread());
            lock.lock();
            System.out.println(lock.isHeldByCurrentThread());
        } finally {
            lock.unlock();
        }
    }

    public void serviceMethod3() {
        try {
            System.out.println(lock.isLocked());
            lock.lock();
            System.out.println(lock.isLocked());
        } finally {
            lock.unlock();
        }
    }

}