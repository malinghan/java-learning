package multithread.blockingqueue;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2022-03-20
 */
public class MyArrayBlockingQueue<E> {

    final Condition notFull;
    final Condition notEmpty;
    int count = 0;
    final Object[] items;
    ReentrantLock lock;
    //2个指针，代表2个边界
    int takeIndex;
    int putIndex;

    public MyArrayBlockingQueue(int capacity, boolean fair) {
        //        if (capacity <= 0) {throw new IllegalArgumentException();}
        this.items = new Object[capacity];
        lock = new ReentrantLock(fair);
        notEmpty = lock.newCondition();
        notFull = lock.newCondition();
    }

    public void put(E e) throws InterruptedException {
        checkNotNull(e);
        final ReentrantLock lock = this.lock;
        lock.lockInterruptibly();
        try {
            while (count == items.length) {
                System.out.println("put block");
                notFull.await();
            }
            System.out.println("put release");
            enqueue(e);
        } finally {
            lock.unlock();
        }
    }

    public E take() throws InterruptedException {
        lock.lockInterruptibly();
        try {
            while (count == 0) {
                System.out.println("take block");
                notEmpty.await();
            }
            System.out.println("take release");
            return dequeue();
        } finally {
            lock.unlock();
        }
    }

    private void enqueue(E x) {
        items[putIndex] = x;
        //循环数组
        if (++putIndex == items.length) {
            putIndex = 0;
        }
        ++count;
        System.out.println("put: x:" + x);
        notEmpty.signal();
    }

    private E dequeue() {
        E x = (E) items[takeIndex];
        items[takeIndex] = null;
        //循环数组
        if (++takeIndex == items.length) {
            takeIndex = 0;
        }
        count--;
        notFull.signal();
        System.out.println("take: x:" + x);
        return x;
    }

    private static void checkNotNull(Object v) {
        if (v == null) {
            throw new NullPointerException();
        }
    }

}