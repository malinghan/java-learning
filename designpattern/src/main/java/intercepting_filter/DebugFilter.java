package intercepting_filter;

/**
 * Created by mlh on 2018/1/1.
 */
public class DebugFilter implements Filter {
    public void execute(String request){
        System.out.println("request log: " + request);
    }
}