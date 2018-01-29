package multithread.synchronize.test13;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/24
 * @description:
 */
public class ObjectService {
    public void serviceMethodA(){
        try{
            synchronized (this){
                System.out.println("A egin time= "+ System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("A end time="+System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void serviceMethodB(){
        synchronized (this){
            System.out.println("B begin "+System.currentTimeMillis());
            System.out.println("B end "+System.currentTimeMillis());
        }
    }
}
