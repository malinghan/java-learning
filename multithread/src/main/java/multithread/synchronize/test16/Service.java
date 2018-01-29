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

        Runnable r=new Runnable() {
            Service s=new Service();
            @Override
            public void run() {
                System.out.println("r");
                s.setUsernamePassword("aaa","aaaaa");
            }
        };
        Runnable r2=new Runnable() {
            Service s=new Service();
            @Override
            public void run() {
                System.out.println("r2");
                s.setUsernamePassword("bbb","bbbbb");
            }
        };
        r.run();
        r2.run();

    }
}
