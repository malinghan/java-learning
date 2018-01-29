package multithread.synchronize.test19;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/26
 * @description:
 */
public class Service {
    public static void print(String s){
        try{
            synchronized (s) {
                while (true) {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        }catch (Exception e){e.printStackTrace();}
    }

    public static void main(String[] args) {
        Service ss=new Service();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                ss.print("aaaa");
            }
        },"a");
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                ss.print("bbb");
            }
        },"b");
        t1.start();
        t2.start();
    }
}
