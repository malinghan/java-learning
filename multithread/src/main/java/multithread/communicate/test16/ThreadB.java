package multithread.communicate.test16;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/6
 * @description:
 */
public class ThreadB extends  Thread {
    @Override
    public void run() {
        try {
            ThreadA a=new ThreadA();
            a.start();
            a.join();
            System.out.println("线程B 在run end 打印");
        } catch (InterruptedException e) {
            System.out.println("线程B 在 catch 打印");
            e.printStackTrace();
        }
    }
}
