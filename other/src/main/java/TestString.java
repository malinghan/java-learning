/**
 * Created by qjyd on 2018/1/9.
 */
public class TestString {
    public static void main(String[] args) {
        String a="aaa";
        String b="aa"+new String("a");
        String c="aaa";
        String d="aa"+"a";
        System.out.println(a==d);
    }
}
