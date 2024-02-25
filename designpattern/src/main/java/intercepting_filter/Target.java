package intercepting_filter;

/**
 * Created by mlh on 2018/1/1.
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
