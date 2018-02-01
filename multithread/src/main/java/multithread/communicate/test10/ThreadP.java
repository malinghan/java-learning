package multithread.communicate.test10;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/31
 * @description:
 */
public class ThreadP extends Thread {

    private P r;

    public ThreadP(P r) {
        super();
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.setValue();
        }
    }

}
