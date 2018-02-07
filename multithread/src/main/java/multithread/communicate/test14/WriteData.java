package multithread.communicate.test14;
import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/2
 * @description:
 */
public class WriteData {

    public void writeMethod(PipedOutputStream out){
        try {
            System.out.println("write :");

            for (int i = 0; i < 300; i++) {
                  String outData=""+(i+1);
                out.write(outData.getBytes());
                System.out.println(outData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
