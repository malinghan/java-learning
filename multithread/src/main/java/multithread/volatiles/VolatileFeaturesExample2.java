package multithread.volatiles;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2022-03-24
 */
public class VolatileFeaturesExample2 {
    long v1 = 0L;
    public synchronized void  set(long l) {
        v1 = l;
    }

    public void getAndIncrement() {
        v1++;
    }

    public synchronized long get() {
        return v1;
    }
}