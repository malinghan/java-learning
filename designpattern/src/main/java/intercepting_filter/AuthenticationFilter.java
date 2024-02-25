package intercepting_filter;

/**
 * Created by mlh on 2018/1/1.
 */
public class AuthenticationFilter implements Filter {
    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }
}