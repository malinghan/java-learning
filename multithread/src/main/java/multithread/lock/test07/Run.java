package multithread.lock.test07;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/9
 * @description: 单对单 生产消费模型
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();

        ThreadA a = new ThreadA(myService);
        a.start();

        ThreadB b = new ThreadB(myService);
        b.start();

    }
}
