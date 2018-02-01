package multithread.communicate.test09;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/31
 * @description:
 */
//加法
public class Add {

    private String lock;

    public Add(String lock) {
        super();
        this.lock = lock;
    }

    public void add() {
        synchronized (lock) {
            ValueObject.list.add("anyString");
            lock.notifyAll();
        }
    }

}

