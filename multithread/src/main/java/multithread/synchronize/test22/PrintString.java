package multithread.synchronize.test22;

import org.omg.PortableServer.THREAD_POLICY_ID;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/29
 * @description:
 */
public class PrintString {
    private boolean isContinuePrint=true;
    public boolean isContinuePrint(){
        return isContinuePrint;
    }
    public void setContinuePrint(boolean isContinuePrint){
        this.isContinuePrint=isContinuePrint;
    }
    public void printStringMethod(){
        try {
            while(isContinuePrint){
                System.out.println("run printStringMethod threadName="+ Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PrintString ps=new PrintString();
        ps.printStringMethod();
        System.out.println("stop it stopThread="+Thread.currentThread().getName());
        ps.setContinuePrint(false);
    }
}
