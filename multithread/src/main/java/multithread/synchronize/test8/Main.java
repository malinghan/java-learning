package multithread.synchronize.test8;

/**
 * Created by mlh on 2017/12/22.
 */
public class Main {
    public int i=10;
    synchronized public void operatorIMainMethod(){
        try{
            System.out.println("MAIN "+Thread.currentThread().getName()+System.currentTimeMillis()+" begin");
              Thread.sleep(5000);
            System.out.println("MAIN"+Thread.currentThread().getName()+System.currentTimeMillis()+" end");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
