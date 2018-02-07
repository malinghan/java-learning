package multithread.communicate.test18;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/6
 * @description:join释放锁
 */
public class Run {

    public static void main(String[] args) {

        try {
            ThreadB b = new ThreadB();

            ThreadA a = new ThreadA(b);
            a.start();

            Thread.sleep(500);

            ThreadC c = new ThreadC(b);
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
