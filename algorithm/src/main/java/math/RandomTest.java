package math;
import java.util.Random;

/**
 * Created by mlh on 2017/12/27.
 */

/**
 * java.lang.Math.Random
 *
 * java.util.Random
 *    Random()：创建一个新的随机数生成器。
 *    Random(long seed)：使用单个 long 种子创建一个新的随机数生成器。
 *       在构造Random对象的时候指定种子（这里指定种子有何作用，请接着往下看），如：Random r1 = new Random(20)
 *       或者默认当前系统时间的毫秒数作为种子数:Random r1 = new Random();
 *
 */
public class RandomTest {
    public static void main(String[] args) {
        System.out.println("Math.random()="+Math.random());//是一个double类型的值，区间为[0.0,1.0）
        int num=(int)(Math.random()*3);// 注意不要写成(int)Math.random()*3，这个结果为0，因为先执行了强制转换
        System.out.println("num= "+num);

        //初始化时25并没有起直接作用（注意：不是没有起作用）,rand.nextInt(100);中的100是随机数的上限,产生的随机数为0-100的整数,不包括100。
//        Random rand =new Random(25);
//        int i;
//        i=rand.nextInt(100);//上限
//        System.out.println("i="+i);

        // 案例2
        // 对于种子相同的Random对象，生成的随机数序列是一样的。
        Random ran1 = new Random(10);
        System.out.println("使用种子为10的Random对象生成[0,10)内随机整数序列: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(ran1.nextInt(10) + " ");
        }
        System.out.println();
        Random ran2 = new Random(10);
        System.out.println("使用另一个种子为10的Random对象生成[0,10)内随机整数序列: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(ran2.nextInt(10) + " ");
        }
    }
}
