package multithread.communicate.test22;
import java.util.Date;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/7
 * @description:
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
