package multithread.communicate.test03;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/30
 * @description:
 */

/**
 * 验证wait会释放锁：a,b共享一个锁；a线程wait之后，b线程依然可以执行
 */

public class Test {

    public static void main(String[] args) {

        Object lock = new Object();

        ThreadA a = new ThreadA(lock);
        a.start();

        ThreadB b = new ThreadB(lock);
        b.start();

    }

}