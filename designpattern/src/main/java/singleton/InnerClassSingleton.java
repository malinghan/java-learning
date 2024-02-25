package singleton;

/**
 * Created by mlh on 2017/12/24.
 */

/**
 * 内部类懒加载
 */
public class InnerClassSingleton {
    private static class SingletonHolder{
        private static final InnerClassSingleton instance=new InnerClassSingleton();
    }
    private InnerClassSingleton(){}
   public static final InnerClassSingleton getInstance(){
        return SingletonHolder.instance;
   }

}
