package multithread.exchanger;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2022-03-24
 */
public class Demo1 {
    public static void main(String[] args) {
        Exchanger<String> stringExchanger = new Exchanger<>();

        Thread studentA = new Thread(() -> {
            String dataA = "aaaaa";
            try {
                String dataB = stringExchanger.exchange(dataA, 5 , TimeUnit.SECONDS);
                System.out.println("A get: dataB~>>" + dataB);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                e.printStackTrace();
                System.out.println("A get time out.");
            }
        });

        Thread studentB = new Thread(() -> {
            String dataB = "bbbbbbbb";
            try {
                Thread.sleep(1000 * 3);
                String dataA = stringExchanger.exchange(dataB);
                System.out.println("B get: dataA! >>" + dataA);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        studentA.start();
        studentB.start();
    }
}
