package prototype;

/**
 * Created by mlh on 2017/12/24.
 */
public class Square extends Shape {
    public Square(){
        type = "Square";
    }
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
