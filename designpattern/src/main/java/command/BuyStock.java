package command;

/**
 * Created by mlh on 2017/12/31.
 */

/**
 * 对行为类：买股票剥离出来
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }
    @Override
    public void execute() {
        abcStock.buy();
    }
}
