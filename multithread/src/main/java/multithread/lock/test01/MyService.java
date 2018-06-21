package multithread.lock.test01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/8
 * @description:
 */
public class MyService {
    private Lock lock=new ReentrantLock();

    public void testReentrantLock(){
        lock.lock();
        for (int i = 0; i < 5; i++) {
            System.out.println("ThreadName="+Thread.currentThread().getName()+" "+(i+1));
        }
        lock.unlock();
    }
}
