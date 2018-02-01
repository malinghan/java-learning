package multithread.communicate.test13;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/31
 * @description:
 */
public class C_Thread extends Thread {

    private C r;

    public C_Thread(C r) {
        super();
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.popService();
        }
    }

}

