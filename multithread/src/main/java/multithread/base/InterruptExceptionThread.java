package multithread.base;

/**
 * Created by mlh on 2017/12/22.
 */
public class InterruptExceptionThread extends  Thread {
    @Override
    public void run() {
        super.run();
        try{
            for (int i = 0; i < 500000; i++) {
                if(this.isInterrupted()){
                    System.out.println("already end");
                    throw new   InterruptedException();
                }
                System.out.println("i="+i);
            }
            System.out.println("under for");
        }catch (Exception e){
            System.out.println("enter catch");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            InterruptExceptionThread t = new InterruptExceptionThread();
            t.start();
            t.sleep(1000);
            t.interrupt();//不是立即停止
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
