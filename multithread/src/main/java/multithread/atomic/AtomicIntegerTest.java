package multithread.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2022-03-24
 * Atomic包提供了以下3个类。
 * ❑ AtomicBoolean：原子更新布尔类型。
 * ❑ AtomicInteger：原子更新整型。
 * ❑ AtomicLong：原子更新长整型
 */
public class AtomicIntegerTest {
    static AtomicInteger ai = new AtomicInteger(1);

    public static void main(String[] args) {
        System.out.println(ai.getAndIncrement());
        System.out.println(ai.get());
    }

}
