package multithread.atomic;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2022-03-24
 * Atomic包提供了以下4个类。
 * ❑ AtomicIntegerArray：原子更新整型数组里的元素。
 * ❑ AtomicLongArray：原子更新长整型数组里的元素。
 * ❑ AtomicReferenceArray：原子更新引用类型数组里的元素
 * int addAndGet（int i，int delta）：以原子方式将输入值与数组中索引i的元素相加。
 * ➢boolean compareAndSet（int i，int expect，int update）
 * ：如果当前值等于预期值，则以原子方式将数组位置i的元素设置成update值。
 */
public class AtomicIntegerArrayTest {
    static  int[] value = new int[]{1,2};
    static AtomicIntegerArray ai = new AtomicIntegerArray(value);
    public static void main(String[] args) {
        ai.getAndSet(0,3);
        System.out.println(ai.get(0));
        System.out.println(value[0]);
    }
}
