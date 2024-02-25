package bridge;

/**
 * Created by mlh on 2017/12/29.
 */

/**
 *   abstract Shape
 *      + Shape(DrawAPI drawAPI)
 *  CircleShape extends Shape implements DrawAPI
 *       + CircleShape(DrawAPI dreaAPI,other)
 *       +draw(drawAPI.drawCircle(other))
 *  GreenCircle implements DrawAPI
 *       +drawCircle(other)
 *  RedCircle  implements DrawAPI
 *      +drawCircle(other)
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new CircleShape(100,100, 10, new RedCircle());
        Shape greenCircle = new CircleShape(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
