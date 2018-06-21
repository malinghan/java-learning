package multithread.lock.test11;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/9
 * @description:
 * lock.hasQueuedThread(threadA)查询指定线程是否在等待此锁
 * lock.hasQueuedThreads() 查询是否有线程在等待此锁
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };

        Thread threadA = new Thread(runnable);
        threadA.start();

        Thread.sleep(500);

        Thread threadB = new Thread(runnable);
        threadB.start();

        Thread.sleep(500);
        System.out.println(service.lock.hasQueuedThread(threadA));
        System.out.println(service.lock.hasQueuedThread(threadB));
        System.out.println(service.lock.hasQueuedThreads());
    }
}