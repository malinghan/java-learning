package multithread.synchronize.test17;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/26
 * @description:
 */
public class MyService {
    public MyOneList addServiceMethod(MyOneList list,String data){
        try {
            synchronized (list){//当多个线程进入下面代码块时，对list的add为同步阻塞的，所以不会出现脏读
                if(list.getSize()<1){//AB 线程，根据分支判断，如果不同步就会脏读
                    //对于不同的list,可以异步调用
                    //对于相同的list，必须同步保证一致性，这就是synchronized (list)的用法
                    Thread.sleep(2000);
                    list.add(data);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) throws InterruptedException{
        MyOneList list=new MyOneList();

        Runnable a=new Runnable() {
            @Override
            public void run() {
                MyService s=new MyService();
                s.addServiceMethod(list,"aaa");
            }
        };

        Runnable b=new Runnable() {
            @Override
            public void run() {
                MyService s=new MyService();
                s.addServiceMethod(list,"bbb");
            }
        };
        Thread ta=new Thread(a,"a");
        Thread tb=new Thread(b,"b");
        ta.start();
        tb.start();
        Thread.sleep(6000);
        System.out.println(list.getSize());//两个service对一个list操作一次add,出现脏读。将list锁住
    }
}
