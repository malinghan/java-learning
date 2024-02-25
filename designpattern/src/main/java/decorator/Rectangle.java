package decorator;

/**
 * Created by mlh on 2017/12/31.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
