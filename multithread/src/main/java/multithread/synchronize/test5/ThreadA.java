package multithread.synchronize.test5;

import multithread.synchronize.test4.MyObject;

/**
 * Created by mlh on 2017/12/22.
 */

/**
 * 出现脏读原因：
 */
public class ThreadA extends  Thread {
    private PublicVar publicVar;
    public ThreadA(PublicVar publicVar){
        super();
        this.publicVar=publicVar;
    }
    @Override
    public void run() {
        super.run();
        publicVar.setValue("B","BB");
    }
}
