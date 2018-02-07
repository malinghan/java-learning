package multithread.communicate.test20;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/7
 * @description:
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return "我是默认值 第一次get不再为null";
    }
}
