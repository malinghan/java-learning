package multithread.synchronize.test12;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/24
 * @description:
 */
public class Run {
    public static void main(String[] args) {
        Task task=new Task();
        TaskA taska=new TaskA(task);
        TaskB taskb=new TaskB(task);
        taska.start();
        taskb.start();
    }
}
