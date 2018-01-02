package multithread.base.b;


/**
 * Created by mlh on 2017/12/18.
 */
/*
  变量不共享
  abcd 4个实例对象，分别有自己的count
 */
public class NotShareDataThread extends  Thread{
      private int count=5;
      public NotShareDataThread(String name){
            super();
            this.setName(name);
      }

      @Override
       public void run() {
            super.run();
//          while (count>0){
                  count--;
                  System.out.println(this.currentThread().getName()+":"+count);
//            }
      }
    public static void main(String[] args) {
        NotShareDataThread a=new NotShareDataThread("A");
        NotShareDataThread b=new NotShareDataThread("B");
        NotShareDataThread c=new NotShareDataThread("C");
        NotShareDataThread d=new NotShareDataThread("D");
        a.start();
        b.start();
        c.start();
        d.start();
    }
}
