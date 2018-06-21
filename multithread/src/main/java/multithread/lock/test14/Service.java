package multithread.lock.test14;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author: linghan.ma
 * @DATE: 2018/6/22
 * @description:
 */
public class Service {
    private ReentrantReadWriteLock lock=new ReentrantReadWriteLock();

    public void read(){
        try{
            try {
                lock.readLock().lock();//
                System.out.println("获取读锁"+Thread.currentThread().getName()+System.currentTimeMillis());

                Thread.sleep(10000); //10s
            } finally {
                lock.readLock().unlock();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
