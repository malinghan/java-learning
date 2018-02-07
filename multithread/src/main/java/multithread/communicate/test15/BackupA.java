package multithread.communicate.test15;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/6
 * @description:
 */
public class BackupA  extends Thread{

    private DBTools dbTools;//

    public BackupA(DBTools dbTools){
        this.dbTools=dbTools;
    }

    @Override
    public void run() {
        dbTools.backupA();
    }
}
