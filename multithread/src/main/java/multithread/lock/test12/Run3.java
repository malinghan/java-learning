package multithread.lock.test12;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/9
 * @description:
 * lock.isLocked() 查询此锁定是否由任意线程保持
 */
public class Run3 {

    public static void main(String[] args) throws InterruptedException {
        final Service service1 = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service1.serviceMethod3();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}

/**
 * false
 true
 */
