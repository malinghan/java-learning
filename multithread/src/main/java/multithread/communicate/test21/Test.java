package multithread.communicate.test21;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/7
 * @description:验证threadlocal变量的隔离性
 */
public class Test {
    public static void main(String[] args) {

        try {
            ThreadA a = new ThreadA();
            ThreadB b = new ThreadB();
            a.start();
            b.start();

            for (int i = 0; i < 100; i++) {
                if (Tools.tl.get() == null) {
                    Tools.tl.set("Main" + (i + 1));
                } else {
                    System.out.println("Main get Value=" + Tools.tl.get());
                }
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
/**
 * Main get Value=Main1
 ThreadB get Value=ThreadB1
 ThreadB get Value=ThreadB1
 ThreadA get Value=ThreadA1
 Main get Value=Main1
 */
