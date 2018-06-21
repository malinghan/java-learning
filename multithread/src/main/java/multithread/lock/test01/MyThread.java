package multithread.lock.test01;

import multithread.synchronize.test17.*;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/8
 * @description:
 */
public class MyThread  extends  Thread{
    private MyService myService;
    public MyThread(MyService myService){
        this.myService=myService;
    }
    @Override
    public void run() {
       myService.testReentrantLock();
    }
}
