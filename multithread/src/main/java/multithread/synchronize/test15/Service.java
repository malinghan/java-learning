package multithread.synchronize.test15;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/25
 * @description:
 */
public class Service {
    private String usernameParam;
    private String passwordParam;
    private String anyString = new String();

    public void setUsernamePassword(String username, String password) {
        try {
            synchronized (anyString) {
                System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis() + "进入同步块");
                usernameParam = username;
                Thread.sleep(3000);
                passwordParam = password;
                System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis() + "出去同步块");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Service s=new Service();
        Runnable r=new Runnable() {
            @Override
            public void run() {
                s.setUsernamePassword("aaa","aaaaa");
            }
        };
        Runnable r2=new Runnable() {
            @Override
            public void run() {
                s.setUsernamePassword("bbb","bbbbb");
            }
        };
        Thread a=new Thread(r,"aaa");
        Thread b=new Thread(r2,"bbb");
        a.start();
        b.start();

    }
}
