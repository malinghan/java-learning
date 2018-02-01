package multithread.communicate.test09;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/31
 * @description: 添加线程
 */
public class ThreadAdd extends Thread {

    private Add p;

    public ThreadAdd(Add p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        p.add();
    }

}