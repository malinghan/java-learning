package command;

/**
 * Created by mlh on 2017/12/31.
 */
import java.util.ArrayList;
import java.util.List;
//创建命令调用类。
public class Broker {
    //命令列表，添加命令
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }
   /*
    按顺序执行命令之后清空
    */
    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}