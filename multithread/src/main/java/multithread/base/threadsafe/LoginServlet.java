package multithread.base.threadsafe;

/**
 * Created by mlh on 2017/12/22.
 */
public class LoginServlet {
    private static  String usernameRef;
    private static String passwordRef;
        synchronized  public  static void doPost(String username,String password) {

        try {
            usernameRef = username;
            if (username.equals("a")) {
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("username="+usernameRef+" password=" +password);
    }catch(Exception e){
            e.printStackTrace();
        }
    }
}
