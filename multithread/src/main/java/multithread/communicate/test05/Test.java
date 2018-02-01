package multithread.communicate.test05;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/31
 * @description:  测试wait interrupt -> InterruptedException
 * 原因：1，执行完同步代码就会释放对象锁
 *      2，执行同步代码过程中遇到异常也会释放锁
 *      3，执行wait也会释放锁，线程进入等待池，可以被唤醒
 */
public class Test {

    public static void main(String[] args) {

        try {
            Object lock = new Object();

            ThreadA a = new ThreadA(lock);
            a.start();

            Thread.sleep(5000);

            a.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
