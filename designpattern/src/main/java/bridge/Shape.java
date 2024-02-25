package bridge;

/**
 * Created by mlh on 2017/12/24.
 */
//抽象类
public abstract class Shape {
    //画圆
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}