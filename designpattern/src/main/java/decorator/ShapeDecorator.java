package decorator;

/**
 * Created by mlh on 2017/12/31.
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;//对抽象构建的引用

    public ShapeDecorator(Shape decoratedShape){ //注入一个抽象构件类型的对象
        this.decoratedShape = decoratedShape;
    }

    public void draw(){  //抽象装饰器类的方法名变
        decoratedShape.draw(); //调用原有业务方法
    }
}