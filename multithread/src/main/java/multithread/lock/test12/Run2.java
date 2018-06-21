package multithread.lock.test12;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/9
 * @description:查询当前线程是否持有此锁
 */
public class Run2 {

    public static void main(String[] args) throws InterruptedException {
        final Service service1 = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service1.serviceMethod2();
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
