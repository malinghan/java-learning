package multithread.base.b;

/**
 * Created by mlh on 2017/12/18.
 */
/*
  这算是多线程访问同一个对象。只生成了一个SharedThread线程实例,生成了abcde子线程
 */
public class SharedThread extends  Thread {
    private int count = 5;
    @Override
    synchronized public void run() {//互斥 临界区
        super.run();
        count--;
        System.out.println(this.currentThread().getName() + ":" + count);
    }
    public static void main(String[] args) {
        SharedThread shareThread=new SharedThread();
       shareThread.start();
        Thread a=new Thread(shareThread,"A");
        Thread b=new Thread(shareThread,"B");
        Thread c=new Thread(shareThread,"C");
        Thread d=new Thread(shareThread,"D");
        Thread e=new Thread(shareThread,"E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
