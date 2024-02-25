package adapter;
import sun.nio.cs.StreamDecoder;

import java.io.*;
/**
 * Created by mlh on 2017/12/31.
 */

/**
 *
 * 装饰器模式：是在不必改变原类文件和使用继承的情况下，动态的扩展一个对象的功能
 *     Shape circle = new Circle();  Shape redCircle = new RedShapeDecorator(new Circle());
   适配器模式：将一个类的接口转换成客户希望的另外一个接口
         `全新接口`
         AudioPlayer audioPlayer = new AudioPlayer();   audioPlayer.play("mp3", "beyond the horizon.mp3");

 * 字符回显程序
 * 类:InputStreamReader,以及其子类FileReader
 这2个类都需要一个InputStream来读取文件中的内容并转换, 这2个类其实就是适配器,
 , 可以把字节流转换成字符流, 然后使用Reader来解析其中的内容

 可以看出，这个类接受一个类型为inputStream的System.in对象(字节流)，将之适配成Reader类型(字符流)，
 然后再使用BufferedReader类“装饰”它，将缓冲功能加上去。这样一来，就可以使用BufferedReader对象的readerLine()
 方法读入整行的输入数据，数据类型是String。

 InputStreamReader input=new InputStreamReader(System.in);这一行使用了适配器模式
 System.in是字节输入流  InputStreamReader转换成了字符输入流   sd = StreamDecoder.forInputStreamReader(in, this, (String)null); // ## check lock object
 StreamDecoder extends Reader（  private InputStream in）   InputStreamReader extends Reader

 BufferedReader reader = new BufferedReader(input);//这一行使用了装饰器模式
             public BufferedReader(Reader in)  InputStreamReader extends Reader
               BufferedReader extends Reader
               增强了read的功能


 */
public class Echo {
    public static void main(String[] args) throws IOException {
        String line;
        InputStreamReader input=new InputStreamReader(System.in);
        System.out.println("Enter data and push enter:");
        BufferedReader reader = new BufferedReader(input);
        line = reader.readLine();//我们需要使用Reader字符流来解析, 但是只有InputStream字节流能直接读取文件内容
        System.out.println("Data entered :"+line);


    }
}
