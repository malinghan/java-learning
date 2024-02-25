package multithread.blockingqueue;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2022-03-20
 */
public class BlockingQueueTest {

    public static void main(String[] args) throws InterruptedException {
//        testArrayBlockingQueue();
        testLinkedBlockingQueue();
    }

    public static void testLinkedBlockingQueue() throws InterruptedException {
        final MyLinkedBlockingQueue arrayBlockingQueue = new MyLinkedBlockingQueue<Integer>(2);
        Thread t1 = new Thread(() -> {
            try {
                while(true) {
                    arrayBlockingQueue.take();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(1000);
                    arrayBlockingQueue.put(i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();
    }

    public static void  testArrayBlockingQueue() throws InterruptedException {
        final MyArrayBlockingQueue arrayBlockingQueue = new MyArrayBlockingQueue<Integer>(2, true);
        Thread t1 = new Thread(() -> {
            try {
                while(true) {
                    arrayBlockingQueue.take();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(1000);
                    arrayBlockingQueue.put(i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();
    }
}
