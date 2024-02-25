package multithread.synchronize.test2;

/**
 * Created by mlh on 2017/12/22.
 */
public class ThreadB extends Thread {
    private  HasSelfPrivateNum numRef;
    public ThreadB(HasSelfPrivateNum numRed){
        super();
        this.numRef=numRed;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }

}
