package multithread.synchronize.test22;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/29
 * @description:
 */
public class RunThread extends  Thread {
      private boolean isRunning =true;
    /**
     * 使用volatile关键词，强制从主内存中读取。
     * 当线程访问isRunning时，强制从公共堆栈中进行取值。
     */
    public boolean isRunning(){
        return isRunning;
    }
    public void setRunning(Boolean isRunning){
        this.isRunning=isRunning;
    }

    @Override
    public   void run() {
        try {
            System.out.println("entering run");
            while(isRunning == true){
                //死循环
                Thread.sleep(2000);
               // isRunning=false;
            }
            System.out.println("running over");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            RunThread r=new RunThread();
            r.start();
            Thread.sleep(1000);
            r.setRunning(false);//此时更新主内存中isRunning的值
            System.out.println(r.isRunning);
            System.out.println("already false");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
