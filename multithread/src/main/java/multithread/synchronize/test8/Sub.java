package multithread.synchronize.test8;

/**
 * Created by mlh on 2017/12/22.
 */
public class Sub extends Main {
    @Override
     public void operatorIMainMethod(){
        try{
            System.out.println("SUB"+Thread.currentThread().getName()+System.currentTimeMillis()+" begin");
            Thread.sleep(5000);
            System.out.println("SUB "+Thread.currentThread().getName()+System.currentTimeMillis()+" end");
            super.operatorIMainMethod();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
