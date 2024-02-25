package multithread.synchronize.test8;

/**
 * Created by mlh on 2017/12/23.
 */
public class MyThreadB extends Thread {
    private  Sub sub;
    public MyThreadB(Sub sub){
        this.sub=sub;
    }
    @Override
    public void run() {
        Sub sub=new Sub();
        sub.operatorIMainMethod();
    }
}
