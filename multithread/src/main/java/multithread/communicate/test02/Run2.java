package multithread.communicate.test02;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/30
 * @description:
 */
public class Run2 {
    public static void main(String[] args) {
        try {
            Object lock=new Object();
            ThreadA a=new ThreadA(lock);
            ThreadB b=new ThreadB(lock);
            b.start();//不为5时 waiting
            Thread.sleep(50);
            a.start();//为5时 notify 但不释放锁，notify所在的线程执行完了，wait线程才会继续执行


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
