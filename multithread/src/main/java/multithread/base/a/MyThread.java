package multithread.base.a;

/**
 * Created by mlh on 2017/12/18.
 */
public class MyThread extends  Thread {
    @Override
    public void run() {
       try {
           for (int i = 0; i <10 ; i++) {
               int time =(int)(Math.random()*1000);
                Thread.sleep(time);//为了保证进程调用的随机性
               System.out.println("run="+Thread.currentThread().getName());
           }
       }catch (InterruptedException e){
           e.printStackTrace();
       }
    }
}
