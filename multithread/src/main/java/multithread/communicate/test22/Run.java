package multithread.communicate.test22;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/7
 * @description:InheritableThreadLocal的使用
 * 验证InheritableThreadLocal可以在子线程中取得父类线程继承下来的值。
 *
 */
public class Run {
        public static void main(String[] args) {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("在Main线程中取值=" + Tools.tl.get());
                    Thread.sleep(100);
                }
                Thread.sleep(5000);
                ThreadA a = new ThreadA();
                a.start();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

/**
 * 在Main线程中取值=1517975546353
 在Main线程中取值=1517975546353
 在Main线程中取值=1517975546353
 在Main线程中取值=1517975546353
 在ThreadA线程中取值=1517975546353
 在ThreadA线程中取值=1517975546353
 在ThreadA线程中取值=1517975546353
 在ThreadA线程中取值=1517975546353
 在ThreadA线程中取值=1517975546353

 Main和ThreadA取到的值是一样的
  */
