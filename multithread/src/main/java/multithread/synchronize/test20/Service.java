package multithread.synchronize.test20;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/26
 * @description:
 */
public class Service {
    Object object1=new Object();
    public void methodA(){
        synchronized (object1){
            System.out.println("method a begin");
            boolean isContinueRun=true;
            while(isContinueRun){

            }
            System.out.println("method a end");
        }
    }
    Object object2=new Object();
    public void methodB(){
        synchronized (object1){
            System.out.println("method b begin");
            System.out.println("method b end");
        }
    }

    public static void main(String[] args) {
        Service ss=new Service();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                ss.methodA();
            }
        },"a");
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                ss.methodB();
            }
        },"b");
        t1.start();
        t2.start();
    }


}
