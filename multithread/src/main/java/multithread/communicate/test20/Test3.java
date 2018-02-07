package multithread.communicate.test20;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/7
 * @description:再次验证ThreadLocal的隔离性
 */
public class Test3 {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(" 在Main线程中取值=" + Tools.tl.get());
                Thread.sleep(100);//
            }
            Thread.sleep(5000);//
            ThreadA a = new ThreadA();
            a.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
/**
 *  在Main线程中取值=1517973714244
 在Main线程中取值=1517973714244
 在Main线程中取值=1517973714244
 在Main线程中取值=1517973714244
 在Main线程中取值=1517973714244
 在Main线程中取值=1517973714244
 在Main线程中取值=1517973714244
 在Main线程中取值=1517973714244
 在Main线程中取值=1517973714244
 在Main线程中取值=1517973714244
 在ThreadA线程中取值=1517973720278
 在ThreadA线程中取值=1517973720278
 在ThreadA线程中取值=1517973720278
 在ThreadA线程中取值=1517973720278
 在ThreadA线程中取值=1517973720278
 在ThreadA线程中取值=1517973720278
 在ThreadA线程中取值=1517973720278
 在ThreadA线程中取值=1517973720278
 在ThreadA线程中取值=1517973720278
 在ThreadA线程中取值=1517973720278

 在Main线程和ThreadA线程存放的值不一样
 但同一线程，调用多次 取的是同一个值
 */
