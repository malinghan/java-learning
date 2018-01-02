package multithread.base;

/**
 * Created by mlh on 2017/12/22.
 */
public class TestThreadMethod extends Thread {
     public TestThreadMethod(){
         System.out.println("构造方法："+Thread.currentThread().getName());// 该方法返回代码段正在被哪个线程调用的信息。
         System.out.println("this.getname="+this.getName());//本线程名称
     }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("run this.getname="+this.getName());
        System.out.println(this.isAlive());

    }

    public static void main(String[] args) {
         TestThreadMethod t=new TestThreadMethod();
        System.out.println(t.isAlive());
         t.start();
        System.out.println(t.isAlive());
        System.out.println(t.getId());
        t.setPriority(5);//1-10
        //System.out.println(Thread.currentThread().getName());//测试currentThread()
    }
}
