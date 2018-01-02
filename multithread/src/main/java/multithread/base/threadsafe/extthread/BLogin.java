package multithread.base.threadsafe.extthread;

import multithread.base.threadsafe.LoginServlet;

/**
 * Created by mlh on 2017/12/22.
 */
public class BLogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("b","bb");
    }
}
