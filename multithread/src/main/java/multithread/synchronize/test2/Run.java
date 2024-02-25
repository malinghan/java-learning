package multithread.synchronize.test2;

/**
 * Created by mlh on 2017/12/22.
 */

/**
 * 测实例变量非线程安全
 */
public class Run{
    public static void main(String[] args) {
        HasSelfPrivateNum numRef=new HasSelfPrivateNum();
        ThreadA t1=new ThreadA(numRef);
        ThreadB t2=new ThreadB(numRef);
        t1.start();
        t2.start();
    }
}
