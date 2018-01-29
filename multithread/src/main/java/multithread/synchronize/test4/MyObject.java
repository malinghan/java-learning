package multithread.synchronize.test4;

/**
 * Created by mlh on 2017/12/22.
 */
public class MyObject {
    public int m=5;
    //
   synchronized  public  void methodA(){
        try{
            System.out.println("begin methodA threadName="+Thread.currentThread().getName());
            m++;
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+" methodA end");
            System.out.println("A"+m);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    public  void methodB(){
       try{
           System.out.println("begin methodB threadName="+Thread.currentThread().getName()+System.currentTimeMillis());
           m++;
           Thread.sleep(5000);
           System.out.println(Thread.currentThread().getName()+"methodA end");
           System.out.println("B"+m);
       }catch(Exception e){
           e.printStackTrace();
       }
    }
}
