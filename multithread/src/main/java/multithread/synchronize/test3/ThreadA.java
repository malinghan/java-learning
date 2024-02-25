package multithread.synchronize.test3;

/**
 * Created by mlh on 2017/12/22.
 */
public class ThreadA extends Thread {
   private  HasSelfPrivateNum numRef;
   public ThreadA(HasSelfPrivateNum numRed){
       super();
        this.numRef=numRed;
   }

    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }
}
