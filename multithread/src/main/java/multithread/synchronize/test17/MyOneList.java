package multithread.synchronize.test17;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/26
 * @description:
 */
public class MyOneList {
    private List list=new ArrayList<>();
    synchronized public void add(String data){//此处虽然加了synchronized
        list.add(data);
    }
    synchronized  public int getSize(){
        return list.size();
    }
}
