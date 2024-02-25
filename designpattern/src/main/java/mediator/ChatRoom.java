package mediator;

/**
 * Created by mlh on 2017/12/31.
 */
import java.util.Date;

/**
 * 中介者
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}