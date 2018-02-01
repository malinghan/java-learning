package multithread.communicate.test02;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/30
 * @description:
 */
public class Run {
    public static void main(String[] args) {
        try {
            Object lock=new Object();
            Test2 t2=new Test2(lock);
            Test3  t3=new Test3(lock);

            t3.start();
            Thread.sleep(6000);

            t2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
