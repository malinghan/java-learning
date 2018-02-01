package multithread.communicate.test02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/30
 * @description:
 */
public class MyList {
    private static List list=new ArrayList<>();
    public static void add(){
        list.add("洒水");
    }
    public static int size(){
        return list.size();
    }
}
