package abstractfactory;

/**
 * Created by mlh on 2017/12/24.
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
