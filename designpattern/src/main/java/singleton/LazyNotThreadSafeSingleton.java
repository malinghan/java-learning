package singleton;

/**
 * Created by mlh on 2017/12/24.
 */
public class LazyNotThreadSafeSingleton {
    private static LazyNotThreadSafeSingleton instance;
    private LazyNotThreadSafeSingleton (){}
    public static LazyNotThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new LazyNotThreadSafeSingleton();//在方法内new对象，线程不安全
        }
        return instance;
    }
}
