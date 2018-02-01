package multithread.communicate.test11;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/31
 * @description:
 */
public class ThreadC extends Thread {

    private C r;

    public ThreadC(C r) {
        super();
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.getValue();
        }
    }

}
