package multithread.base;

/**
 * Created by mlh on 2017/12/17.
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
        myThread.start();
        System.out.println("运行结束！");
    }
}
/*
多次调用start会出现IllegalThreadStateException
myThread
Exception in thread "main" java.lang.IllegalThreadStateException
	at java.lang.Thread.start(Thread.java:705)
	at multithread.base.Run.main(Run.java:10)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
Process finished with exit code 1
 */