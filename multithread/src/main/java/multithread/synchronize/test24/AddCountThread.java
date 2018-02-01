package multithread.synchronize.test24;

import javax.print.attribute.standard.RequestingUserName;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/29
 * @description:
 */

/**
 * 原子类是不可分割的整体，没有其他线程能中断或检查正在原子操作的变量，
 * 一个原子类型就是一个原子操作可用的类型
 * 可以在没有锁的情况下，实现线程安全
 */
public class AddCountThread  extends Thread{
   private AtomicInteger count=new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            System.out.println(count.incrementAndGet());//相当于count++
        }
    }

    public static void main(String[] args) {
        AddCountThread c=new AddCountThread();
        Thread t1=new Thread(c);
        Thread t2=new Thread(c);
        Thread t3=new Thread(c);
        Thread t4=new Thread(c);
        Thread t5=new Thread(c);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
