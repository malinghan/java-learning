package multithread.lock.test08;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/9
 * @description: 多对多 生产消费模型
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();

        ThreadA[] threadA = new ThreadA[10];
        ThreadB[] threadB = new ThreadB[10];

        for (int i = 0; i < 100; i++) {
            threadA[i] = new ThreadA(myService);
            threadB[i] = new  ThreadB(myService);
            threadA[i].start();
            threadB[i].start();
        }

    }
}
