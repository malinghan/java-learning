package multithread.lock.test11;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/9
 * @description:
 * lock.hasWaiters(newCondition) 查询是否有线程正在等待与此锁定相关的condition条件
 * lock.getWaitQueueLength(newCondition) 查询有多少线程正在等待与此锁定相关的condition条件
 *
 */
public class Run2 {
        public static void main(String[] args) throws InterruptedException {
            final Service service = new Service();

            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    service.waitMethod();
                }
            };

            Thread[] threadArray = new Thread[10];
            for (int i = 0; i < 10; i++) {
                threadArray[i] = new Thread(runnable);
            }
            for (int i = 0; i < 10; i++) {
                threadArray[i].start();
            }
            Thread.sleep(2000);
            service.notityMethod();
        }
    }


/**
 * 有没有线程正在等待newCondition？true
 * 线程数是多少？10
 */
