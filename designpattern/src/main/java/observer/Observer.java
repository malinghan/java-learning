package observer;

/**
 * Created by mlh on 2017/12/31.
 */

/**
 * 观察者都有一个更新状态的方法
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
