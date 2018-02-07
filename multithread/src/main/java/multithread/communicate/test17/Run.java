package multithread.communicate.test17;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/6
 * @description:
 */
public class Run {
    public static void main(String[] args) {

        Thread b=new Thread(new Runnable() {

            synchronized public void bService(){
                System.out.println("bService timer= "+System.currentTimeMillis());
            }

            @Override
            public void run() {
                try {
                    System.out.println("b begin timer="+ System.currentTimeMillis());
                    Thread.sleep(5000);
                    System.out.println("b end timer="+System.currentTimeMillis());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        },"b");


        Thread a=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (b){
                        b.start();
                       Thread.sleep(6000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread c=new Thread(new Runnable() {
            @Override
            public void run() {
                b.run();
            }
        });

        try {
            a.start();
            Thread.sleep(1000);
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

   /* public final synchronized void join(long millis)
            throws InterruptedException {
        long base = System.currentTimeMillis();
        long now = 0;

        if (millis < 0) {
            throw new IllegalArgumentException("timeout value is negative");
        }

        if (millis == 0) {
            while (isAlive()) {
                wait(0);//0
            }
        } else {
            while (isAlive()) {
                long delay = millis - now;
                if (delay <= 0) {
                    break;
                }
                wait(delay);//wait
                now = System.currentTimeMillis() - base;
            }
        }
    }*/
