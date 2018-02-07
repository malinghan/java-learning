package multithread.communicate.test17;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/6
 * @description:sleep不释放锁
 */
public class Run2 {

    public static void main(String[] args) {

        try {
            ThreadB b = new ThreadB();

            ThreadA a = new ThreadA(b);
            a.start();

            Thread.sleep(1000);

            ThreadC c = new ThreadC(b);
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
