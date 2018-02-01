package multithread.communicate.test12;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/31
 * @description:
 */

public class C {

    private MyStack myStack;//

    public C(MyStack myStack) {//
        super();
        this.myStack = myStack;
    }

    public void popService() {//pop
        System.out.println("pop=" + myStack.pop());
    }
}
