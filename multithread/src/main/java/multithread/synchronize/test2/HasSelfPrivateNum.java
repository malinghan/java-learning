package multithread.synchronize.test2;

/**
 * Created by mlh on 2017/12/22.
 */
public class HasSelfPrivateNum {
    private  int num = 0;
    public void addI(String username){
        try {
            if (username.equals("a")) {
                num = 100;
                System.out.println("a set over");
                Thread.sleep(2000);
            }else{
                num=200;
                System.out.println("b set over");
            }
            System.out.println(username + " num= " + num);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
