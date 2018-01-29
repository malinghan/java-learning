package multithread.synchronize.test18;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/26
 * @description:
 */
public class Service {

    synchronized public static void printA() {
        try {
            System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入printA");
            Thread.sleep(3000);
            System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开printA");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized public static void printB() {
        System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入printB");
        System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开printB");
    }

    synchronized public void printC(){
        System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入printC");
        System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开printC");
    }

    public static void main(String[] args) {
        Service s=new Service();
        Runnable a=new Runnable() {
            @Override
            public void run() {
                s.printA();
            }
        };
        Runnable b=new Runnable() {
            @Override
            public void run() {
                s.printB();
            }
        };
        Runnable c=new Runnable() {
            @Override
            public void run() {
                s.printC();
            }
        };


        Thread t1=new Thread(a,"aa");
        Thread t2=new Thread(b,"bb");
        Thread t3=new Thread(c,"cc");
        t1.start();
        t2.start();
        t3.start();
    }
}
