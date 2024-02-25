package multithread.a2022;

import java.util.concurrent.Semaphore;

/**
 * @author malinghan <malinghan@kuaishou.com>
 * Created on 2022-02-09
 */
public class FooBar {
    private Semaphore f1 = new Semaphore(1);
    private Semaphore f2 = new Semaphore(0);
    private Semaphore f3 = new Semaphore(0);

    public void first(Runnable printFirst) throws InterruptedException {
        f1.acquire();
        printFirst.run();
        f2.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        // printSecond.run() outputs "second". Do not change or remove this line.
        f2.acquire();
        printSecond.run();
        f3.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
         f3.acquire();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
        f1.release();
    }

    public static void main(String[] args) {
        FooBar fooBar = new FooBar();
        Runnable first = () -> {System.out.println("first");};
        Runnable second = () -> {System.out.println("second");};
        Runnable third = () -> {System.out.println("third");};
        Thread firstT = new Thread(() -> {
            try {
                fooBar.first(first);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread secondT = new Thread(() -> {
            try {
                fooBar.second(second);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thirdT = new Thread(() -> {
            try {
                fooBar.third(third);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        firstT.start();
        secondT.start();
        thirdT.start();
    }
}
