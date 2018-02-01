package multithread.synchronize.test23;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/29
 * @description:
 */

/**
 *   验证：volatile非原子性
 *  100个线程,由于addCount未加synchronized
 */
public class MyThread  extends Thread {
    //public static int count;
    volatile public static int count;
    //synchronized static  private  void addCount(){
    private static void addCount(){
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("count="+count);
    }

    @Override
    public void run() {
        addCount();
    }

    public static void main(String[] args) {
        MyThread [] array= new MyThread[10000];
        for (int i = 0; i < 10000; i++) {
            array[i]=new MyThread();
        }
        for (int i = 0; i < 10000; i++) {
            array[i].start();
            
        }
    }
}
/**
 *  count=200
     count=200
     count=300
     count=400
     count=500
     count=600
     count=700
     count=800
 */

