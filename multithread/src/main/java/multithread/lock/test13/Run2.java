package multithread.lock.test13;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/9
 * @description:
 * lock.lockInterruptibly() 替代lock.lock()
 * 如果当前线程未被中断，则获取锁定；如果已被中断，则出现异常；
 *
 * 正常情况是lock.lock() 会忽略threadB.interrupt()
 */
public class Run2 {

    public static void main(String[] args) throws InterruptedException {
        final Service2 service = new Service2();
        Runnable runnableRef = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };

        Thread threadA = new Thread(runnableRef);
        threadA.setName("A");
        threadA.start();
        Thread.sleep(500);
        Thread threadB = new Thread(runnableRef);
        threadB.setName("B");
        threadB.start();
        threadB.interrupt();
    }
}
