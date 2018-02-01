package multithread.communicate.test12;

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
            if(list.size()==1){//有货就不push
                this.wait();
            }

            list.add("any-"+Math.random());
            this.notify();//一生产者，一消费者
            System.out.println("push："+list.size());//获取list的size
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized  String pop(){
        String returnValue="";

        try {
            if(list.size()==0){//没货就不pop
                System.out.println("pop： " +Thread.currentThread().getName()+"线程呈wait状态");
                this.wait();
            }

            returnValue=""+list.remove(0);
            this.notify();

            System.out.println("pop:"+list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return returnValue;
    }
}
