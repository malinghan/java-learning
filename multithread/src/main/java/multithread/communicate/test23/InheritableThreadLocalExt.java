package multithread.communicate.test23;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/7
 * @description:
 */
import java.util.Date;

public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }

    /**
     *
     * @param parentValue
     * @return 子线程值获取到的值默认等于父线程
     */
    @Override
    protected Object childValue(Object parentValue) {
        return parentValue + " 我在子线程加的~!";
    }
}
