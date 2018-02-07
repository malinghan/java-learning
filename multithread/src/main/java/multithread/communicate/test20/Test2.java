package multithread.communicate.test20;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/7
 * @description:解决Threadlocal.get为null
 */
public class Test2 {
        public static ThreadLocalExt tl = new ThreadLocalExt();//static

        public static void main(String[] args) {
            if (tl.get() == null) {
                System.out.println("从未放过值");
                tl.set("我的值");
            }
            System.out.println(tl.get());
            System.out.println(tl.get());
        }
}
