package multithread.synchronize.test5;

/**
 * Created by mlh on 2017/12/22.
 */

/**
 * 出现脏读原因：
 * getValue不同步  setValue同步
 * 脏读一定出现在操作实例变量的情况下，不同线程“争抢”实例变量的结果。
 */
public class Run {
    public static void main(String[] args) {
        try{
        PublicVar publicVar=new PublicVar();
        ThreadA thread=new ThreadA(publicVar);
        thread.start();
        Thread.sleep(200);
        publicVar.getValue();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
