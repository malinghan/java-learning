package multithread.synchronize.test3;

/**
 * Created by mlh on 2017/12/22.
 */

/**
 * synchronized 作用于方法，对象实例锁
 * 例子两个线程访问同一个类的两个实例的同步方法，效果确实异步的
 *
 * static方法是类方法，只能修改static成员变量
 */
public class Run{
    public static void main(String[] args) {
        HasSelfPrivateNum numRef1=new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2=new HasSelfPrivateNum();
        ThreadA t1=new ThreadA(numRef1);
        t1.start();
        ThreadB t2=new ThreadB(numRef2);
        t2.start();

    }
}
