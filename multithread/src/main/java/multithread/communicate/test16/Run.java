package multithread.communicate.test16;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/6
 * @description:
 * B -> A.join
 * C -> B.interrupt
 *
 * result:
 * B -> throws InterruptedException
 * A -> continue running
 */
public class Run {
    public static void main(String[] args) {
       /* try {*/
            ThreadB b=new ThreadB();
            b.start();
            //Thread.sleep(500); //sleep 0.5s
            //Thread.sleep(5000); sleep 5s
            ThreadC c=new ThreadC(b);
            c.start();
       /* } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}
