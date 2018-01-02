package singleton;

/**
 * Created by mlh on 2017/12/24.
 */

/**
 * 使用static 类变量共享，线程同步
 */
public class SingleObject {
    //创建 SingleObject 的一个对象
    private static  SingleObject instance=new SingleObject();
    //让构造函数为 private，这样该类就不会被实例化
    private SingleObject(){}
    //获取唯一可用的对象
    public synchronized static  SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World!");
    }
}
