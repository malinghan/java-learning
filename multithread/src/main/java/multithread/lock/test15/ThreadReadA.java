package multithread.lock.test15;

/**
 * @author: linghan.ma
 * @DATE: 2018/6/22
 * @description:
 */
public class ThreadReadA extends  Thread{
    private WriteService service;

    public ThreadReadA(WriteService service){
       // super();
        this.service=service;
    }

    public void  run(){
        service.read();
    }
}
