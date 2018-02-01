package multithread.communicate.test02;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/30
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        try {
            String s=new String("sa");
            System.out.println("before syn");
            synchronized (s) {
                System.out.println("before wait");
                s.wait();
                System.out.println("after wait");
            }
            System.out.println("over syn");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/**
 *Exception in thread "main" java.lang.IllegalMonitorStateException
   at java.lang.Object.wait(Native Method)
   at java.lang.Object.wait(Object.java:502)
 */