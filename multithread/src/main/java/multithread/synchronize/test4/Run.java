package multithread.synchronize.test4;

/**
 * Created by mlh on 2017/12/22.
 */

/**
 * synchronized public void methodA() 同步
 * public void methodB()   异步
 * A线程先持有object对象的Lock。B线程可以以异步的方式调用object中的非synchronized方法
 * A线程先持有object对象的Lock。B线程如果在这个时候调用object对象中的synchronized方法需要等待，也就是同步。
 * 如果methodA和methodB都对同一实例变量有修改，则会出现脏读
 */
public class Run {
    public static void main(String[] args) {
        MyObject object=new MyObject();
        ThreadA a=new ThreadA(object);
        a.setName("A");
        ThreadB b=new ThreadB(object);
        b.setName("B");
        a.start();
        b.start();
    }
}
