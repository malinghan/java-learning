package multithread.base.a;

/**
 * Created by mlh on 2017/12/18.
 */

/**
 * 知识点：
 * 1,线程的调用具有随机性，异步。不是你先准备好就先运行你的
 * 2,执行start()的顺序不代表线程启动的顺序
 */
public class Test {
    public static void main(String[] args) {
        try {
             MyThread thread=new MyThread();
             thread.setName("myThread");
             thread.start();
            for (int i = 0; i <10 ; i++) {
                int time=(int)(Math.random()*1000);
                Thread.sleep(time);
                System.out.println("main="+Thread.currentThread().getName());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
/*
说明run和main
run=myThread
main=main
run=myThread
run=myThread
main=main
main=main
run=myThread
main=main
main=main
run=myThread
run=myThread
run=myThread
main=main
run=myThread
main=main
run=myThread
main=main
run=myThread
main=main
main=main

*/