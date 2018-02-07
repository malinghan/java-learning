package multithread.communicate.test19;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/6
 * @description:
 */
public class RunFirst {

    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        ThreadA a = new ThreadA(b);
        a.start();
        b.start();//b总是先抢到锁，a有b的锁，然后等待a运行完。
        System.out.println("   main end=" + System.currentTimeMillis());
    }

}
