package multithread.communicate.test11;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/31
 * @description:
 * //notify只能唤醒一个，可能是同类，可能是异类，导致很多waiting线程，造成假死
 * //将notify改为notifyAll
 */
public class Run {

    public static void main(String[] args)  throws InterruptedException{

        String lock = new String("");

        P p = new P(lock);
        C r = new C(lock);

        ThreadP[] pThread = new ThreadP[2];
        ThreadC[] rThread = new ThreadC[2];

        for (int i = 0; i < 2; i++) {
            pThread[i] = new ThreadP(p);
            pThread[i].setName("生产者" + (i + 1));

            rThread[i] = new ThreadC(r);
            rThread[i].setName("消费者" + (i + 1));

            pThread[i].start();
            rThread[i].start();
        }

        Thread.sleep(5000);

        Thread[] threadArray = new Thread[Thread.currentThread()
                .getThreadGroup().activeCount()];//激活

        Thread.currentThread().getThreadGroup().enumerate(threadArray);//线程组

        for (int i = 0; i < threadArray.length; i++) {
            System.out.println(threadArray[i].getName() + " "
                    + threadArray[i].getState());//
        }
    }

}

