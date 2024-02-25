package singleton;

/**
 * Created by mlh on 2017/12/24.
 */
public class LazyThreadSafeSingleton {
    private static LazyThreadSafeSingleton instance;
    private LazyThreadSafeSingleton (){}
    //加了同步锁
    public static synchronized LazyThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new LazyThreadSafeSingleton();
        }
        return instance;
    }
}