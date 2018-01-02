package memento;

import memento.CareTaker;
import memento.Originator;

/**
 * Created by mlh on 2017/12/31.
 */
public class MementoPatternDemo {

    public static void main(String[] args) {
        Originator originator=new Originator();
        CareTaker careTaker=new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateMemento());//保存了备份
        originator.setState("State #3");
        careTaker.add(originator.saveStateMemento());//保存了2份
        originator.setState("State #4");
        System.out.println("Current State: " + originator.getState());//4
        originator.getStateMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());//2
        originator.getStateMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());//3
    }
}
