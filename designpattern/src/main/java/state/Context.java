package state;

/**
 * Created by mlh on 2017/12/31.
 */

/**
 * Context -> state(start stop)
 */
public class Context {
    private State state;
    public Context(){
        state = null;
    }
    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
