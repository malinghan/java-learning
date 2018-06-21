package multithread.lock.test06;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/9
 * @description: 使用ReentrantLock对象唤醒指定种类的线程
 * 使用多个Condition实现通知部分线程
 * conditionA.signalAll()
 * conditionB.signalAll()
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

        service.signalAll_A();

    }

}
