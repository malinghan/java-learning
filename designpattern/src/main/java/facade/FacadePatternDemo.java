package facade;

/**
 * Created by mlh on 2017/12/31.
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();//不用关系怎么构造的，怎么调用的，新的方法。
//        shapeMaker.drawRectangle();
//        shapeMaker.drawSquare();
    }
}