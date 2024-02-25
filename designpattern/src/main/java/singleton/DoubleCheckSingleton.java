package singleton;

/**
 * Created by mlh on 2017/12/24.
 */

/**
 * 双重检查加锁机制的实现会使用一个关键字volatile，
 * 它的意思是：被volatile修饰的变量的值，将不会被本地线程缓存，
 * 所有对该变量的读写都是直接操作共享内存,从而确保多个线程能正确的处理该变量。
 */
public class DoubleCheckSingleton {
    private volatile static DoubleCheckSingleton singleton;
    private DoubleCheckSingleton(){}
    public static DoubleCheckSingleton getInstance(){
        if(singleton==null){//第一次检查是不同步的，排除那些singleton不为空的调用
            synchronized (DoubleCheckSingleton.class){
                if(singleton==null){//第二次检查是同步的
                    singleton=new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
