package multithread.synchronize.test12;

import com.sun.source.util.TaskListener;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/24
 * @description:
 */
public class TaskA extends Thread{
    private Task task;
    public TaskA(Task task){
        super();
        this.task=task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
