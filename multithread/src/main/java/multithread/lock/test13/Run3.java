package multithread.lock.test13;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/9
 * @description:
 * Boolean lock.tryLock()
 * 仅在调用时锁定未被另一个线程保持的情况下，才获取该锁定
 *
 * 如果已经有个线程调用了lock.lock() 则不会获取锁，不会等待获取，返回false;
 *
 */
public class Run3 {
    public static void main(String[] args) throws InterruptedException {
        final Service3 service = new Service3();

        Runnable runnableRef = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
                //waitMethod()
            }
        };

        Thread threadA = new Thread(runnableRef);
        threadA.setName("A");
        threadA.start();
        Thread threadB = new Thread(runnableRef);
        threadB.setName("B");
        threadB.start();
    }
}
/**
 * A获得锁
 B没有获得锁
 */
