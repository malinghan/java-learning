package facade;

/**
 * Created by mlh on 2017/12/31.
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
