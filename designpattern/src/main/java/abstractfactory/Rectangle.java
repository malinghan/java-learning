package abstractfactory;

/**
 * Created by mlh on 2017/12/24.
 */
//矩形
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
