package multithread.synchronize.test22;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/29
 * @description:
 */
public class PrintStr  implements  Runnable{

    private boolean isContinuePrint=true;
    public boolean isContinuePrint(){
        return isContinuePrint;
    }
    public void setContinuePrint(boolean isContinuePrint){
        this.isContinuePrint=isContinuePrint;
    }
    public void printStringMethod(){
        try {
            while(isContinuePrint==true){
                System.out.println("run printStringMethod threadName="+ Thread.currentThread().getName());
                Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        printStringMethod();
    }

    public static void main(String[] args) {
        PrintStr ps=new PrintStr();
        new Thread(ps).start();
        ps.printStringMethod();
        System.out.println("stop it stopThread="+Thread.currentThread().getName());
        ps.setContinuePrint(false);
    }
}
