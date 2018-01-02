package command;

/**
 * Created by mlh on 2017/12/31.
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();
        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);//添加了Buy命令
        broker.takeOrder(sellStockOrder);//添加了Sell命令

        broker.placeOrders();
    }
}
