package multithread.communicate.test09;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/31
 * @description:
 */
public class ThreadSubtract extends Thread {

    private Subtract r;

    public ThreadSubtract(Subtract r) {
        super();
        this.r = r;
    }

    @Override
    public void run() {
        r.subtract();
    }

}