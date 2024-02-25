package multithread.synchronize.test7;

/**
 * Created by mlh on 2017/12/22.
 */
public class Main {
    public int i=10;
    synchronized public void operatorIMainMethod(){
        try{
              i--;
            System.out.println("main print i="+i);
              Thread.sleep(100);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
