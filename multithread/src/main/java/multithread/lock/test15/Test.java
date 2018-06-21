package multithread.lock.test15;

/**
 * @author: linghan.ma
 * @DATE: 2018/6/22
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        WriteService service=new WriteService();
        ThreadReadA a=new ThreadReadA(service);
        a.setName("A");
        ThreadReadB b=new ThreadReadB(service);
        b.setName("B");
        a.start();
        b.start();
    }
}
