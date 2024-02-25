package bridge;

/**
 * Created by mlh on 2017/12/24.
 */
public class RedCircle implements  DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
