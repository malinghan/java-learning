package decorator;

/**
 * Created by mlh on 2017/12/31.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}