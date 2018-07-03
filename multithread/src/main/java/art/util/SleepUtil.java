package art.util;

/**
 * @author: linghan.ma
 * @DATE: 2018/7/3
 * @description:
 */
public class SleepUtil {
    public static void second(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
