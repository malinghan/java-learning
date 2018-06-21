package multithread.lock.test09;

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
            System.out.println("ThreadName=" + Thread.currentThread().getName()
                    + "获得锁定"); //获取锁
        } finally {
            lock.unlock();
        }
    }

}

/**
 *
 * //fair {@code true} if this lock should use a fair ordering policy
    public ReentrantLock(boolean fair) {
        sync = fair ? new FairSync() : new NonfairSync();
    }
 */
