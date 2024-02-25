package multithread.synchronize.test4;

/**
 * Created by mlh on 2017/12/22.
 */
public class MyObject {
    //
   synchronized  public  void methodA(){
        try{
            System.out.println("begin methodA threadName="+Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+" methodA end");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
     public  void methodB(){
       try{
           System.out.println("begin methodB threadName="+Thread.currentThread().getName()+System.currentTimeMillis());
           Thread.sleep(5000);
           System.out.println(Thread.currentThread().getName()+"methodA end");
       }catch(Exception e){
           e.printStackTrace();
       }
    }
}
