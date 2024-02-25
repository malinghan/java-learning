package multithread.jmm;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2022-03-24
 * //在上面示例代码中，假设A线程执行writer()方法后，B线程执行reader()方法。这是一个正确同步的多线程程序。
 * // 根据JMM规范，该程序的执行结果将与该程序在顺序一致性模型中的执行结果相同。
 */
public class SynchronizedExample {
    int a = 0;
    boolean flag = false;
    public synchronized void writer() { //获取锁
        a = 1;
        flag = true;
    }

    public synchronized void reader() {
        if (flag) {
            int i = a; //释放锁
        }
    }
}
