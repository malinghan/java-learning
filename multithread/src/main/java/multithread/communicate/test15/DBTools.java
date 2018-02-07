package multithread.communicate.test15;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/6
 * @description: DB交叉备份
 */
public class DBTools {
      volatile private boolean prevIsA=false;

    synchronized public void backupA(){
        try{
            while(prevIsA){
                wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("✔️✔️✔️✔️✔️✔️✔️✔️");
            }
            prevIsA=true;
            notifyAll();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized public void backupB(){
        try{
            while(prevIsA==false){
                wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("BBBBBBBB️");
            }
            prevIsA=false;
            notifyAll();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
