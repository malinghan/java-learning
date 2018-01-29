package multithread.synchronize.test10;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/24
 * @description:
 */
public class ThreadA extends Thread {
    private ObjectService objectService;
    public ThreadA(ObjectService objectService){
          super();
        this.objectService=objectService;
    }

    @Override
    public void run() {
        super.run();
        objectService.serviceMethod();
    }
}
