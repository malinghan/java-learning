package memento;

/**
 * Created by mlh on 2017/12/31.
 */
public class Originator {

    private String state;

    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state=state;
    }

    public String setState(){
        return state;
    }

    public Memento saveStateMemento(){
        return new Memento(state);//保存方法
    }

    public void getStateMemento(Memento   memento){
        state=memento.getState();//从其他memento改变当前的state
    }
}
