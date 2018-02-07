package multithread.communicate.test19;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/6
 * @description:
 *  A -> syn(b)  run(sleep(5000))
 *  B -> run(sleep(5000))
 *
 *  a.start
 *  b.start
 *  b.join(2000)
 *
 *  main 同步
 *
 *
 *
 */
public class Run1 {
        public static void main(String[] args) {
            try {
                ThreadB b = new ThreadB();
                ThreadA a = new ThreadA(b);
                a.start();
                b.start();
                b.join(2000);//b等待2s释放锁
                //a.join(2000);//a等待2s释放锁
                System.out.println("                    main end "
                        + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

/**
 * begin B ThreadName=Thread-0  1517918706258
 end B ThreadName=Thread-0  1517918711263
 begin A ThreadName=Thread-1  1517918711263
 end A ThreadName=Thread-1  1517918716265
 main end 1517918716265
 */

/**
 * begin B ThreadName=Thread-0  1517918706258
 end B ThreadName=Thread-0  1517918711263

 main end 1517918716265

 begin A ThreadName=Thread-1  1517918711263
 end A ThreadName=Thread-1  1517918716265

 */

/**
 *                     main end 1517919475672
 begin A ThreadName=Thread-1  1517919475672
 end A ThreadName=Thread-1  1517919480675  b.join(2000)
 begin B ThreadName=Thread-0  1517919480676
 end B ThreadName=Thread-0  1517919485677
 */
