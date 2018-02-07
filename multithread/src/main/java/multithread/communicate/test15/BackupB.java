package multithread.communicate.test15;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/6
 * @description:
 */
public class BackupB  extends Thread{

    private DBTools dbTools;//

    public BackupB(DBTools dbTools){
        this.dbTools=dbTools;
    }

    @Override
    public void run() {
        dbTools.backupB();
    }
}
