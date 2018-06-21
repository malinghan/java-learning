package multithread.lock.test05;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/9
 * @description:
 * service.signalAll() 把A和B同时唤醒
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {

        MyService service = new MyService();

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();

        Thread.sleep(3000);

        service.signalAll();

    }

}
