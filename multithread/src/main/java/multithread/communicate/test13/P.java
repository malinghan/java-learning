package multithread.communicate.test13;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/31
 * @description:
 */
public class P {

    private MyStack myStack;

    public P(MyStack myStack) {
        super();
        this.myStack = myStack;
    }

    public void pushService() {
        myStack.push();
    }
}
