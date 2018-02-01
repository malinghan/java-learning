package multithread.communicate.test12;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/31
 * @description:
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        P p = new P(myStack);
        C r = new C(myStack);

        P_Thread pThread = new P_Thread(p);
        C_Thread rThread = new C_Thread(r);
        pThread.start();
        rThread.start();
    }

}