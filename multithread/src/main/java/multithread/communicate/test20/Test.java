package multithread.communicate.test20;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/7
 * @description:
 */
public class Test {

    public static ThreadLocal tl = new ThreadLocal();

    public static void main(String[] args) {
        if (tl.get() == null) {
            System.out.println("从未放过值");
            tl.set("我的值");
        }
        System.out.println(tl.get());
        System.out.println(tl.get());
    }
}

/**
 * Thread

ThreadLocal.ThreadLocalMap threadLocals
ThreadLocal.ThreadLocalMap inheritableThreadLocals = null;

ThreadLocal

get()//获取当前线程在ThreadLocalMap中的值
set(T value)//为当前线程在ThreadLocalMap
remove()//移除getMap
initialValue//初始化，需要重新写
getMap(Thread t)//返回当前线程threadLocals
createMap(Thread t, T firstValue)//在某一线程中创建threadLocals
createInheritedMap(ThreadLocalMap parentMap)//创建inheritableThreadLocals
childValue(T parentValue)
threadLocalHashCode = nextHashCode();
nextHashCode =  new AtomicInteger();

ThreadLocalMap{
Entry(ThreadLocal<?> k, Object v);
ThreadLocalMap(ThreadLocal<?> firstKey, Object firstValue);
ThreadLocalMap(ThreadLocalMap parentMap);
nextIndex(int i, int len)
prevIndex(int i, int len)
set(ThreadLocal<?> key, Object value)
remove(ThreadLocal<?> key)
rehash()
resize()
INITIAL_CAPACITY = 16;
Entry[] table;
size = 0;
threshold; //The next size value at which to resize.
}
 */

