package multithread.synchronize.test20;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/26
 * @description:
 */
public class DeathThread implements Runnable {
    public String username;
    public Object lock1=new Object();
    public Object lock2=new Object();

    public void setFlag(String username){
        this.username=username;
    }

    @Override
    public void run() {
        if(username.equals("a")){
            synchronized (lock1){
            try {
                    System.out.println("username"+username);
                    Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock2){
                System.out.println("lock1 -> lock2 顺序执行");
            }
            }
        }

        if(username.equals("b")){
            synchronized (lock2 ){
                try {
                    System.out.println("username"+username);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1 ){
                    System.out.println("lock2 -> lock1 顺序执行");
                }
            }
        }
    }

    public static void main(String[] args) {
        try {
            DeathThread ss=new DeathThread();
            ss.setFlag("a");
            Thread t1=new Thread(ss);
            t1.start();

            Thread.sleep(100);
            ss.setFlag("b");
            Thread t2=new Thread(ss);
            t2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
