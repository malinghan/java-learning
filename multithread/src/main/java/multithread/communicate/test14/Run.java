package multithread.communicate.test14;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/5
 * @description:
 */
public class Run {
    public static void main(String[] args) {
        try {
                WriteData writeData=new WriteData();
                ReadData readData=new ReadData();

                PipedInputStream inputStream=new PipedInputStream();
                PipedOutputStream outputStream=new PipedOutputStream();

                outputStream.connect(inputStream);

                ThreadRead threadRead=new ThreadRead(readData,inputStream);//输入
                ThreadWrite threadWrite=new ThreadWrite(writeData,outputStream);//输出

                threadRead.start();
                Thread.sleep(2000);

                threadWrite.start();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
