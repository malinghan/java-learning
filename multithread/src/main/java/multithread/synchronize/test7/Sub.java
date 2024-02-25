package multithread.synchronize.test7;

/**
 * Created by mlh on 2017/12/22.
 */
public class Sub extends Main {
    synchronized public void operatorISubMethod(){
        try{
            while (i>0){
                i--;
                System.out.println("sub print i="+i);
                Thread.sleep(100);
                this.operatorIMainMethod();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
