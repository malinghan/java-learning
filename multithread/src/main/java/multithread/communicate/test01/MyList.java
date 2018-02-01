package multithread.communicate.test01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/30
 * @description:
 */
public class MyList {
    private List list=new ArrayList();
    public void add(){
        list.add("洒水");
    }
    public int size(){
        return list.size();
    }
}
