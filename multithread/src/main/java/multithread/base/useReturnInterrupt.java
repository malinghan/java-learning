package multithread.base;

/**
 * Created by mlh on 2017/12/22.
 */
public class useReturnInterrupt extends  Thread {
    @Override
    public void run() {
        while (true) {
            if (this.isInterrupted()) {
                System.out.println("停止了");
                return;
            }
            System.out.println("timer=" + System.currentTimeMillis());
        }
    }

    public static void main(String[] args) {
        try {
            useReturnInterrupt t = new useReturnInterrupt();
            t.start();
            Thread.sleep(2000);
            t.interrupt();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}