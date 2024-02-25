package interpreter;

/**
 * Created by mlh on 2017/12/31. 创建一个表达式接口。
 */
public interface Expression {
    public boolean interpret(String context);
}