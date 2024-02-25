package multithread.atomic;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2022-03-24
 * 原子更新基本类型的AtomicInteger，只能更新一个变量，如果要原子更新多个变量，就需要使用这个原子更新引用类型提供的类。Atomic包提供了以下3个类。
 * ❑ AtomicReference：原子更新引用类型。
 * ❑ AtomicReferenceFieldUpdater：原子更新引用类型里的字段。
 * ❑ AtomicMarkableReference：原子更新带有标记位的引用类型。可以原子更新一个布尔类型的标记位和引用类型。构造方法是AtomicMarkableReference（V initialRef, boolean
 * initialMark）。
 */
public class AtomicReferenceTest {
    public static AtomicReference<User> atomicReference = new AtomicReference<>();
    public static void main(String[] args) {
        User user = new User("conan", 11);
        User updateU = new User("Shinee", 13);
        atomicReference.set(user);
        atomicReference.compareAndSet(user, updateU);
        System.out.println(atomicReference.get().getName());
        System.out.println(atomicReference.get().getOld());
    }

   static class User {
       private String name;
       private int old;
       public User(String name, int old) {
           this.name = name;
           this.old = old;
       }

       public String getName() {
           return name;
       }

       public int getOld() {
           return old;
       }
    }
}
