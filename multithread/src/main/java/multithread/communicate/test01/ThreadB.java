package multithread.communicate.test01;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/30
 * @description:
 */
public class ThreadB extends  Thread{
    private MyList list;
    public ThreadB(MyList list){
        super();
        this.list=list;
    }

    @Override
    public void run() {
        try {
            while (true){
                if(list.size()==5){
                    System.out.println("==5 b out!");
                    throw new InterruptedException();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
