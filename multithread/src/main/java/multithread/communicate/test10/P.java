package multithread.communicate.test10;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/31
 * @description:
 */


public class P {

    private String lock;

    public P(String lock) {
        super();
        this.lock = lock;
    }

    public void setValue() {
        try {
            synchronized (lock) {
                if (!ValueObject.value.equals("")) {
                    lock.wait();
                }
                String value = System.currentTimeMillis() + "_"
                        + System.nanoTime();
                System.out.println("set的值是" + value);
                ValueObject.value = value;//赋值
                lock.notify();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
