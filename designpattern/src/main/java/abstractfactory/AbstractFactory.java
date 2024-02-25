package abstractfactory;

/**
 * Created by mlh on 2017/12/24.
 */

/**
 * 抽象类
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}