package multithread.communicate.test02;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/30
 * @description:
 */
public class Test2  extends Thread{
    private Object lock;
    public Test2(Object lock){
         super();
        this.lock=lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            try {
                System.out.println("begin wait time="+System.currentTimeMillis());
                lock.wait();
                System.out.println("end wait time="+System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
