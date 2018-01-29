package multithread.synchronize.test21;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/29
 * @description:
 */
public class OutClass {
    static class Inner{
        public void method1(){
            synchronized (this ){
                for (int i = 0; i <10 ; i++) {
                    System.out.println(Thread.currentThread().getName()+"i="+i);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        public synchronized  void method2(){
            for (int i = 0; i < 20; i++) {
                System.out.println(Thread.currentThread().getName()+"i="+i);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void method3(Inner2 inner2){
            synchronized (inner2){
                for (int i = 0; i <10 ; i++) {
                    System.out.println(Thread.currentThread().getName()+"i="+i);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        static class Inner2{
            public synchronized  void method4(){
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"i="+i);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void main(String[] args) {
        final Inner inner=new Inner();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method1();
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method2();
            }
        });

        t1.start();
        t2.start();

    }
}
