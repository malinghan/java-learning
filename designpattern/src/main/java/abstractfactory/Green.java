package abstractfactory;

/**
 * Created by mlh on 2017/12/24.
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}