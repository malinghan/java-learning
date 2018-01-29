package multithread.base.example01;

/**
 * Created by mlh on 2017/12/19.
 */

/**
 * 线程的构造线程为main
 * run方法的调用为MyThread的实例线程Thread-0
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
    }
}
/**
 构造方法打印:main
 run方法的打印：Thread-0
 **/