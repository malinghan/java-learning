package multithread.communicate.test15;

/**
 * @author: linghan.ma
 * @DATE: 2018/2/6
 * @description:
 */
public class Run {
    public static void main(String[] args) {
        DBTools db=new DBTools();
        for (int i = 0; i < 20; i++) {
            BackupA a= new BackupA(db);
            BackupB b=new BackupB(db);
            a.start();
            b.start();
        }

    }
}
