package multithread.communicate.test16;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/6
 * @description:
 */
public class ThreadA extends  Thread {

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String newString=new String();
            Math.random();
        }
    }
}
