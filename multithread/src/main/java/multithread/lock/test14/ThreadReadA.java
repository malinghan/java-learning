package multithread.lock.test14;

/**
 * @author: linghan.ma
 * @DATE: 2018/6/22
 * @description:
 */
public class ThreadReadA extends  Thread{
    private Service service;

    public ThreadReadA(Service service){
       // super();
        this.service=service;
    }

    public void  run(){
        service.read();
    }
}
