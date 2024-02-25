package decorator;

/**
 * Created by mlh on 2017/12/31.
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();//调用原有业务方法
        setRedBorder(decoratedShape);//调用新增业务方法,能画出红色边框
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}