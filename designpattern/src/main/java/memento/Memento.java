package memento;

/**
 * Created by mlh on 2017/12/31.
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state=state;
    }

    public String getState(){
       return  state;
    }
}
