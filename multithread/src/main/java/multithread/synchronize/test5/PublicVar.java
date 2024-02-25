package multithread.synchronize.test5;

/**
 * Created by mlh on 2017/12/22.
 */
public class PublicVar {
    public String username="A";
    public String password="AA";
    synchronized  public void setValue(String username,String password){
        try {
            this.username=username;
            Thread.sleep(5000);
            this.password=password;
            System.out.println("setValue method thread name="+Thread.currentThread().getName()+"username="+username+"password="+password);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public void getValue(){
        System.out.println("setValue method thread name="+Thread.currentThread().getName()+"username="+username+"password="+password);
    }
}
