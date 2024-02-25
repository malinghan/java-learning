package flyweight;

/**
 * Created by mlh on 2017/12/31.
 */
import java.util.HashMap;//缓存

public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);//如果有，直接返回缓存中的

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);//如果没用，构造新的，并且加入缓存中
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}