package multithread.base;

/**
 * Created by mlh on 2017/12/22.
 */
public class Daemon extends Thread {
        private  int i=0;

    @Override
    public void run() {
        super.run();
        try{
                while (true){
                    i++;
                    System.out.println("i="+i);
                    Thread.sleep(1000);//
                    System.out.println(this.currentThread().getName());
                }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try{
           Daemon t=new Daemon();
           t.setDaemon(true);
            System.out.println(t.currentThread().getName());
           t.start();
           Thread.sleep(5000);//线程停止运行，
            System.out.println("我离开thread对象也不再打印");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
