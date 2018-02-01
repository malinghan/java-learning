package multithread.communicate.test01;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/30
 * @description:
 */
public class Run {
    public static void main(String[] args) {
        MyList service=new MyList();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        ThreadB b=new ThreadB(service);
        b.setName("B");
        a.start();
        b.start();
    }
}
