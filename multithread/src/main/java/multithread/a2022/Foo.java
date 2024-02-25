package multithread.a2022;

/**
 * @author malinghan <malinghan@kuaishou.com>
 * Created on 2022-02-09
 */
public class Foo {
    private boolean firstFinished;
    private boolean secondFinished;
    private Object lock = new Object();

    public Foo(){

    }

    public void first(Runnable pFirst) throws InterruptedException{
      synchronized (lock) {
          pFirst.run();
          firstFinished = true;
          lock.notifyAll();
      }
    }

    public void second(Runnable pSecond)  throws InterruptedException{
        synchronized (lock) {
            while(!firstFinished) {
                lock.wait();
            }
            secondFinished = true;
            pSecond.run();
            lock.notifyAll();
        }
    }

    public void third(Runnable pThird)  throws InterruptedException{
        synchronized (lock) {
            while (!secondFinished) {
                lock.wait();
            }
            pThird.run();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable a = () -> System.out.println("first");
        Runnable b = () -> System.out.println("second");
        Runnable c = () -> System.out.println("third");
        final Foo foo = new Foo();

        new Thread(() -> {
            try {
                foo.second(b);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                foo.first(a);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                foo.third(c);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
