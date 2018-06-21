package multithread.lock.test13;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/9
 * @description:
 * lock.tryLock(3, TimeUnit.SECONDS)
 * 如果 锁定在等待时间内没有被另一个线程保持，且当前线程未被中断，则获取该锁定。
 * 3秒内不断尝试获取锁
 */
public class Run4 {

    public static void main(String[] args) throws InterruptedException {
        final Service4 service = new Service4();

        Runnable runnableRef = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()
                        + "调用waitMethod时间：" + System.currentTimeMillis());
                service.waitMethod();
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
