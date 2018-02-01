package multithread.communicate.test02;


/**
 * @author: linghan.ma
 * @DATE: 2018/1/30
 * @description:
 */
public class ThreadA extends  Thread{
    private Object lock;
    public ThreadA(Object lock){
        super();
        this.lock=lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                for (int i = 0; i < 10; i++) {
                    MyList.add();
                     if(MyList.size()==5){
                         lock.notify();
                         System.out.println("already send notify");
                     }
                    System.out.println("add "+(i+1)+" element");
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
