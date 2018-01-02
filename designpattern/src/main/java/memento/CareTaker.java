package memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mlh on 2017/12/31.
 */
public class CareTaker {
    private List<Memento> mementoList=new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento get(int  index){
        return mementoList.get(index);
    }
}
