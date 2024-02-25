package multithread.base;

/**
 * Created by mlh on 2017/12/22.
 */
public class InterruptedThread extends Thread {
    @Override
    public void run() {
            super.run();
        for (int i = 0; i < 50000; i++) {
            System.out.println("i="+(i+1));
        }
    }

    public static void main(String[] args) {
        try {
            InterruptedThread t = new InterruptedThread();
            t.start();
            Thread.sleep(2000);
            t.isInterrupted();
            t.interrupted();

            t.interrupt();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
