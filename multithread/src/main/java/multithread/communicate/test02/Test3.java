package multithread.communicate.test02;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/30
 * @description:
 */
public class Test3 extends  Thread{
    private Object lock;
    public Test3(Object lock){
        super();
        this.lock=lock;
    }

    @Override
    public void run() {
        synchronized (lock){
                System.out.println("begin notify time="+System.currentTimeMillis());
                lock.notify();
                System.out.println("end notify time="+System.currentTimeMillis());
        }
    }
}
