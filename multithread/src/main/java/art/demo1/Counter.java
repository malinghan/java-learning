package art.demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: linghan.ma
 * @DATE: 2018/6/24
 * @description: i++ atomicInteger++ 区别
 */
public class Counter {
    private int i = 0;

    private AtomicInteger atomicI = new AtomicInteger(0);

    public static void main(String[] args) {

        final  Counter cas = new Counter();
        List<Thread> ts= new ArrayList<>(600);
        long start = System.currentTimeMillis();
        //100 1000*100
            for (int j = 0; j < 100; j++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000; i++) {
                        cas.count();
                        cas.safeCount();
                    }
                }
            });

            ts.add(t);
        }

        for(Thread t:ts){
            t.start();
//            try {
//                t.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(cas.i);
//            System.out.println(cas.atomicI.get());
//            System.out.println(System.currentTimeMillis()-start);
        }

        for(Thread t:ts){
            try {
                t.join();//等待线程累加完毕
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(cas.i);
            System.out.println(cas.atomicI.get());
            System.out.println(System.currentTimeMillis()-start);
        }
    }

    /**
     * unsafe count
     */
    private  void count(){
        i++;
    }

    /**
     * safe count
     */
    private void safeCount(){
        for(;;){
            int i = atomicI.get();
            boolean suc = atomicI.compareAndSet(i,++i);
            if(suc){
                break;
            }
        }
    }
}
