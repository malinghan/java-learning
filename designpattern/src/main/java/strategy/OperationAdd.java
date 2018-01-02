package strategy;

/**
 * Created by mlh on 2017/12/31.
 */
public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}