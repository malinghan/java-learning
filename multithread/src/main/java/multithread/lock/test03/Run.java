package multithread.lock.test03;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/8
 * @description:Condition对象的使用,
 *
 * condition.await()
 * condition.signal()
 * 一定要在lock unlock中使用
 */
public class Run {

    public static void main(String[] args) {

        MyService service = new MyService();

        ThreadA a = new ThreadA(service);
        a.start();

    }

}


/**
 * Exception in thread "Thread-0" java.lang.IllegalMonitorStateException
 at java.util.concurrent.locks.ReentrantLock$Sync.tryRelease(ReentrantLock.java:151)
 at java.util.concurrent.locks.AbstractQueuedSynchronizer.release(AbstractQueuedSynchronizer.java:1261)
 at java.util.concurrent.locks.AbstractQueuedSynchronizer.fullyRelease(AbstractQueuedSynchronizer.java:1723)
 at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2036)
 at multithread.lock.test03.MyService.await(MyService.java:19)
 at multithread.lock.test03.ThreadA.run(ThreadA.java:19)

 IllegalMonitorStateException:

 */
