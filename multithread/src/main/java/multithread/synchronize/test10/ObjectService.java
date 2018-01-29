package multithread.synchronize.test10;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/24
 * @description:
 */
public class ObjectService {
    public void serviceMethod(){
        try{
            synchronized (this){
                System.out.println("begin time= "+ System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("end time="+System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
