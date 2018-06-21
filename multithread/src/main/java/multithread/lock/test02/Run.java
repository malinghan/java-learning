package multithread.lock.test02;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/8
 * @description:验证lock :methodA methodB共享一个锁，方法同步
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadAA aa = new ThreadAA(service);
        aa.setName("AA");
        aa.start();

        Thread.sleep(100);

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();

        ThreadBB bb = new ThreadBB(service);
        bb.setName("BB");
        bb.start();

    }

}
