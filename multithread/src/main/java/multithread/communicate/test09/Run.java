package multithread.communicate.test09;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/31
 * @description: while能监听到条件的变化。
 */
public class Run {
    public static void main(String[] args)  throws  InterruptedException{

         String lock = new String("");

        Add add = new Add(lock);

        Subtract subtract = new Subtract(lock);

        ThreadSubtract subtract1Thread = new ThreadSubtract(subtract);
        subtract1Thread.setName("subtract1Thread");
        subtract1Thread.start();//-1

        ThreadSubtract subtract2Thread = new ThreadSubtract(subtract);
        subtract2Thread.setName("subtract2Thread");
        subtract2Thread.start();//-

        Thread.sleep(1000);

        ThreadAdd addThread = new ThreadAdd(add);
        addThread.setName("addThread");
        addThread.start();//+

    }
}
