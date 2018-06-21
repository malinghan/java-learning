package multithread.lock.test10;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/9
 * @description:
 * lock.getHoldCount()  查询当前线程保存锁定的个数，调用lock.lock()的数量
 * lock.getQueueLength()  查询正等待获取此锁定的线程估计数
 * lock.getWaitQueueLength() 查询等待与此锁定相关条件Condition的线程数
 *
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        //service.serviceMethod1(); 测试 lock.getHoldCount()

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.serviceMethod3();
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
        System.out.println("有线程数：" + service.lock.getQueueLength() + "在等待获取锁！");


//        /**
//         * 运行结果：
//         * 有线程数：9在等待获取锁！
//         */




//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                service.waitMethod();
//            }
//        };
//
//        Thread[] threadArray = new Thread[10];
//        for (int i = 0; i < 10; i++) {
//            threadArray[i] = new Thread(runnable);
//        }
//        for (int i = 0; i < 10; i++) {
//            threadArray[i].start();
//        }
//        Thread.sleep(2000);
//        service.notityMethod();

        /**
         * 运行结果：
         * 有10个线程正在等待newCondition
         */


    }
}
