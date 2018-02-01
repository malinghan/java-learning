package multithread.synchronize.test25;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/29
 * @description:
 */
public class Service {
    private  boolean isCOntinueRun=true;
    public void runMethod(){
        String ss=new String();
        while(isCOntinueRun==true){
             synchronized (ss){}
        }
        System.out.println("cannt stop!");
    }

    public void stopMethod(){
        isCOntinueRun=false;
    }

    public static void main(String[] args) {
        try {
            Service s=new Service();
            Thread a=new Thread(new Runnable() {
                @Override
                public void run() {
                    s.runMethod();
                }
            });
            Thread b=new Thread(new Runnable() {
                @Override
                public void run() {
                    s.runMethod();
                }
            });

            a.start();
            Thread.sleep(1000);
            b.start();
            System.out.println("already send stop message!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
