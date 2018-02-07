package multithread.communicate.test14;

import java.io.PipedOutputStream;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/5
 * @description:
 */
public class ThreadWrite extends  Thread {
    private WriteData write;
    private PipedOutputStream out;

    public ThreadWrite(WriteData write,PipedOutputStream out){
        super();
        this.write=write;

        this.out = out;
    }
    @Override
    public void run() {
        write.writeMethod(out);
    }
}
