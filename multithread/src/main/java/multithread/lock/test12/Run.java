package multithread.lock.test12;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/9
 * @description:
 * lock.isFair() 判断是不是公平锁
 * 默认是非公平锁
 */

public class Run {

    public static void main(String[] args) throws InterruptedException {

        final Service service1 = new Service(true);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service1.serviceMethod();
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        final Service service2 = new Service(false);
        runnable = new Runnable() {
            @Override
            public void run() {
                service2.serviceMethod();
            }
        };

        thread = new Thread(runnable);
        thread.start();

    }
}


/**
 * 公平锁情况：true
 公平锁情况：false
 */
