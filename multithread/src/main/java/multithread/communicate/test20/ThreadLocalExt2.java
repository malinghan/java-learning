package multithread.communicate.test20;
import java.util.Date;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/7
 * @description:
 */
public class ThreadLocalExt2 extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
