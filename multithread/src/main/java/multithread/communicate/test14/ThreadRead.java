package multithread.communicate.test14;

import java.io.PipedInputStream;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/5
 * @description:
 */
public class ThreadRead extends Thread {
    private ReadData read;
    private PipedInputStream input;

    public ThreadRead(ReadData read, PipedInputStream input){
        super();
        this.read=read;
        this.input=input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }
}
