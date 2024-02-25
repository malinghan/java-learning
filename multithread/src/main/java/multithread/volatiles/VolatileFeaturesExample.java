package multithread.volatiles;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2022-03-24
 */
public class VolatileFeaturesExample {
    volatile long v1 = 0L;
    //public void synchronized set(long l) {v1 = l;}
    public void set(long l) {v1 = l;}
    //public void getAndIncrement() {v1++;}
    public void getAndIncrement() {v1++;}
    // public long synchronized get() {return v1;}
    public long get() {return v1;}
}