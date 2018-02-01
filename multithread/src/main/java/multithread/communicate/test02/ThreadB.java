package multithread.communicate.test02;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/30
 * @description:
 */
public class ThreadB extends  Thread{
    private Object lock;
    public ThreadB(Object lock){
        super();
        this.lock=lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock){
                if(MyList.size()!=5){
                    System.out.println("wait begin "+System.currentTimeMillis());
                    lock.wait();
                    System.out.println("wait end "+System.currentTimeMillis());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
