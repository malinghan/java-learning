package multithread.communicate.test21;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/7
 * @description:
 */
public class ThreadB  extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                if (Tools.tl.get() == null) {
                    Tools.tl.set("ThreadB" + (i + 1));
                } else {
                    System.out.println("ThreadB get Value=" + Tools.tl.get());
                }
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
