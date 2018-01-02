package strategy;

/**
 * Created by mlh on 2017/12/31.
 */
public class Context {
    private Strategy strategy;//计算抽象

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){//具体
        return strategy.doOperation(num1, num2);
    }
}
