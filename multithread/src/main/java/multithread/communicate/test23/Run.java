package multithread.communicate.test23;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/7
 * @description:子线程：线程A内调用线程B的start方法，则B为子线程，A为父线程
 * 使用：childValue
 * InheritableThreadLocal 子线程取得的值修改
 */
public class Run {

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("在Main线程中取值=" + Tools.tl.get());
                Thread.sleep(200);
            }
            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
/***
 * 在Main线程中取值=1517975626103
 在ThreadA线程中取值=1517975626103 我在子线程加的~!
 * 子线程取得值在父线程的基础上修改的
 */
