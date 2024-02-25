package bridge;

/**
 * Created by mlh on 2017/12/29.
 */

/**
 * 桥接模式的具体体现
 * 通过继承Shape,把Shape的draw方法
 * 通过构造方法 引入接口drawAPI
 */
public class CircleShape extends  Shape {
    private int x,y,radius;
   public  CircleShape(int x,int y,int radius,DrawAPI drawAPI){
       super(drawAPI);
       this.x=x;
       this.y=y;
       this.radius=radius;
   }
    @Override
    public void draw() {
       drawAPI.drawCircle(radius,x,y);
    }
}
