package multithread.synchronize.test22;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/29
 * @description:
 */
public class RunThread extends  Thread {
    private boolean isRunning =true;
    public boolean isRunning(){
        return isRunning;
    }
    public void setRunning(Boolean isRunning){
        this.isRunning=isRunning;
    }

    @Override
    public void run() {
        System.out.println("entering run");
        while(isRunning == true){

        }
        System.out.println("running over");
    }

    public static void main(String[] args) {
        try {
            RunThread r=new RunThread();
            r.start();
            Thread.sleep(10000);
            r.setRunning(false);
            System.out.println("already false");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
