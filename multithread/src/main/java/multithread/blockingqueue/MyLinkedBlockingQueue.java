package multithread.blockingqueue;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2022-03-20
 */
public class MyLinkedBlockingQueue<E> {

    private final int capacity;
    Node<E> head;
    Node<E> last;

    private final AtomicInteger count = new AtomicInteger();

    private final ReentrantLock takeLock = new ReentrantLock();
    private final ReentrantLock putLock = new ReentrantLock();

    private final Condition notEmpty = takeLock.newCondition();
    private final Condition notFull = putLock.newCondition();
    static class Node<E> {
        E item;
        Node<E> next;
        Node(E x) { item = x; }
    }

    public MyLinkedBlockingQueue(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException();
        this.capacity = capacity;
        last = head = new Node<>(null);
    }

    public void put(E e) throws InterruptedException {
        if (e == null) throw new NullPointerException();
        int c = -1;
        Node<E> node = new Node<>(e);
        putLock.lockInterruptibly();
        try {
            while (count.get() == capacity) {
                System.out.println("put block");
                notFull.await();
            }
            System.out.println("put release");
            enqueue(node);
            c = count.getAndIncrement();
            if (c + 1 < capacity) {
                notFull.signal();
            }
            System.out.println("put e:" + e);
        } finally {
            putLock.unlock();
        }
        if (c == 0) {
            signalNotEmpty();
        }
    }

    public E take() throws InterruptedException {
        E x;
        int c = -1;
        takeLock.lockInterruptibly();
        try {
            while (count.get() == 0) {
                System.out.println("take block");
                notEmpty.await();
            }
            System.out.println("take release");
            x = dequeue();
            c = count.getAndDecrement();
            System.out.println("task: x :" + x);
            if (c > 1)
                notEmpty.signal();
        } finally {
            takeLock.unlock();
        }
        if (c == capacity) {
            signalNotFull();
        }
        return x;
    }

    private void signalNotFull() {
        final ReentrantLock putLock = this.putLock;
        putLock.lock();
        try {
            notFull.signal();
        } finally {
            putLock.unlock();
        }
    }

    private void signalNotEmpty() {
        final ReentrantLock takeLock = this.takeLock;
        takeLock.lock();
        try {
            notEmpty.signal();
        } finally {
            takeLock.unlock();
        }
    }

    private void enqueue(Node<E> node) {
        last.next = node;
        last = last.next;
    }

    private E dequeue() {
        Node<E> h = head;
        Node<E> first = h.next;
        h.next = h;
        head = first;
        E x = first.item;
        first.item = null;
        return x;
    }
}
