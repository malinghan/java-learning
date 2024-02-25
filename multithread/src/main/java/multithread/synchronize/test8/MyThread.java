package multithread.synchronize.test8;


/**
 * Created by mlh on 2017/12/22.
 */
public class MyThread extends Thread {
    private  Sub sub;
    public MyThread(Sub sub){
        this.sub=sub;
    }
    @Override
    public void run() {
        Sub sub=new Sub();
        sub.operatorIMainMethod();
    }
}
