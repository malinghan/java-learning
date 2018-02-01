package multithread.synchronize.test24;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/29
 * @description:
 */
public class MyThread extends  Thread{
 private MyService myService;
    public MyThread(MyService myService){
        this.myService=myService;
    }

    @Override
    public void run() {
        myService.addNum();
    }
}
