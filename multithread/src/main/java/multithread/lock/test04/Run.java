package multithread.lock.test04;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/8
 * @description:Condition对象的使用
 *
 * unlock一定要在finally中使用
 * await和signal要使用try-catch块
 *
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {

        MyService service = new MyService();

        ThreadA a = new ThreadA(service);
        a.start();

        Thread.sleep(3000);

        service.signal();

    }

}


