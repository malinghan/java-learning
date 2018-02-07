package multithread.communicate.test18;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/6
 * @description:
 */
public class ThreadC extends Thread {

    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        super();
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.bService();//
    }

}
