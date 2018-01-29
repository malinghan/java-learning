package multithread.synchronize.test12;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/24
 * @description:
 */
public class Task {
    public void doLongTimeTask(){
        for(int i=0;i<100;i++){
            System.out.println("nosynchronized "+Thread.currentThread().getName()+"i"+(i+1));
        }
        System.out.println("");
        synchronized (this){
            for (int i = 0; i < 100; i++) {
                System.out.println("synchronized "+Thread.currentThread().getName()+"i"+(i+1));
            }
        }
    }
}
/**
 * 非同步代码块,交叉执行；同步代码块，顺序执行
 */
