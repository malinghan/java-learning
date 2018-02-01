package multithread.communicate.test09;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/31
 * @description:
 */
//减法
public class Subtract {

    private String lock;

    public Subtract(String lock) {
        super();
        this.lock = lock;
    }

    public void subtract() {
        try {
            synchronized (lock) {
                while(ValueObject.list.size() == 0) {//会不断循环执行语句块中的语句，直到循环条件为false，才会跳出while循环。
                    System.out.println("wait begin ThreadName="
                            + Thread.currentThread().getName());
                    lock.wait();
                    System.out.println("wait   end ThreadName="
                            + Thread.currentThread().getName());
                }
                ValueObject.list.remove(0);
                System.out.println("list size=" + ValueObject.list.size());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}