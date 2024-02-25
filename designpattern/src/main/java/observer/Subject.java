package observer;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by mlh on 2017/12/31.
 */
public class Subject {
    private List<Observer> observers=new ArrayList<Observer>();

    private int state;

    public int getState(){
        return state;
    };

    /**\
     * 在状态变化的方法上，主动通知观察者
     * @param state
     */
    public void setState(int state){
        this.state=state;
        notifyAllObservers();
    }

    /**
     * 添加观察者
     * @param observer
     */
    public void attach(Observer observer){
        observers.add(observer);
    }

    /***
     * 调用观察者的update方法通知所有的观察者
     */
    public void notifyAllObservers(){
        for (Observer observer:observers){
            observer.update();
        }
    }
}
