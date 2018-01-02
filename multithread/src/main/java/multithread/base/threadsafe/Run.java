package multithread.base.threadsafe;

import multithread.base.threadsafe.extthread.ALogin;
import multithread.base.threadsafe.extthread.BLogin;

/**
 * Created by mlh on 2017/12/22.
 */
public class Run {
    public static void main(String[] args) {
        ALogin a=new ALogin();
        a.start();
        BLogin b=new BLogin();
        b.start();
    }
}
/*
不加  synchronized
username=a password=bb
username=a password=aa
加了
username=a password=aa
username=b password=bb
 */