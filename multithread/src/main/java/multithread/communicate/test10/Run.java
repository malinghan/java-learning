package multithread.communicate.test10;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/31
 * @description:
 * //生产者：有货，wait;没货，setValue 生产货，notify
 * //消费者: 没货，wait;有货，getValue 消费货，notify
 * //生产者，消费者，使用同一个lock
 */
public class Run {

    public static void main(String[] args) {

        String lock = new String("");
        P p = new P(lock);
        C r = new C(lock);

        ThreadP pThread = new ThreadP(p);
        ThreadC rThread = new ThreadC(r);

        pThread.start();
        rThread.start();
    }

}

