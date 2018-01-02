package multithread.synchronize.test8;

/**
 * Created by mlh on 2017/12/22.
 */
public class Run {
    public static void main(String[] args) {
        Sub subRef=new Sub();
        MyThread a=new MyThread(subRef);
        a.setName("A");
        a.start();
        MyThreadB t=new MyThreadB(subRef);
        t.setName("B");
        t.start();
    }
}
/**
 SUBA1513980825072 begin
 SUBB1513980825072 begin   异步调用
 SUB A1513980830072 end
 MAIN A1513980830072 begin
 SUB B1513980830073 end
 MAIN B1513980830073 begin
 MAINA1513980835073 end
 MAINB1513980835074 end
 **/