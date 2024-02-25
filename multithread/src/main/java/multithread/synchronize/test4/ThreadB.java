package multithread.synchronize.test4;

/**
 * Created by mlh on 2017/12/22.
 */
public class ThreadB extends  Thread {
    private MyObject object;
    public ThreadB(MyObject object){
        super();
        this.object=object;
    }
    @Override
    public void run() {
        super.run();
//        object.methodA();
        object.methodB();
    }

}
