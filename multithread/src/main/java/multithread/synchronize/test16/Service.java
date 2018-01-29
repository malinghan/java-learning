package multithread.synchronize.test16;

import multithread.synchronize.test1.ThreadA;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/25
 * @description:
 */
public class Service {
    private String usernameParam;
    private String passwordParam;
    private String anyString = new String();

    public void a(String username, String password) {
        try {
            synchronized (anyString) {
                System.out.println("进入同步块 a");
                usernameParam = username;
                Thread.sleep(3000);
                passwordParam = password;
                System.out.println("出去同步块 a");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void b(){
        System.out.println("b begin ");
        System.out.println("b end");
    }

    public static void main(String[] args) {
        Service s=new Service();
        Runnable r=new Runnable() {
            @Override
            public void run() {
                s.a("aaa","aaaaa");
            }
        };
        Runnable r2=new Runnable() {
            @Override
            public void run() {
                s.b();
            }
        };
        Thread a=new Thread(r);
        Thread b=new Thread(r2);
       a.start();
        b.start();

    }
}
