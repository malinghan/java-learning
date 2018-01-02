package singleton;

/**
 * Created by mlh on 2017/12/24.
 */

/**
 * 线程安全的啊
 */
public class NotLazySingleton {
    private static NotLazySingleton instance = new NotLazySingleton();
    private NotLazySingleton (){}
    public static NotLazySingleton getInstance() {
        return instance;
    }
}
