package multithread.finaltest;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2022-03-25
 * 查看字节码：
 * javac FinalExample.java
 * javap -c FinalExample.class
 */
public class FinalExample {
    final int i;
    static FinalExample obj;
    public FinalExample() {
        i = 1;                           //1写final域
        obj = this;                      //2 this引用在此"逸出"
    }

    public static void writer() {
        new FinalExample();
    }

    public static void reader() {
        if (obj != null) {              //3
            int temp = obj.i;           //4
        }
    }
}
