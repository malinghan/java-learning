package multithread.communicate.test12;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/31
 * @description:
 */
public class P_Thread extends Thread {

    private P p;

    public P_Thread(P p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.pushService();
        }
    }

}
