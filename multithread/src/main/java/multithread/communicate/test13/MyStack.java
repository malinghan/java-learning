package multithread.communicate.test13;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/31
 * @description:
 */
public class MyStack {

    private List list=new ArrayList<>();

    synchronized public void push(){
        try {
            while(list.size()==1){//有货就不push
                this.wait();
            }

            list.add("any-"+Math.random());
            this.notifyAll();
            System.out.println("push："+list.size());//获取list的size
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized  String pop(){
        String returnValue="";

        try {
            while(list.size()==0){//没货就不pop
                System.out.println("pop： " +Thread.currentThread().getName()+"线程呈wait状态");
                this.wait();
            }

            returnValue=""+list.remove(0);
            this.notifyAll();

            System.out.println("pop:"+list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return returnValue;
    }
}
