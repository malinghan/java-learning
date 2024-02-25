package builder;

/**
 * Created by mlh on 2017/12/24.
 */

/**
 * 食物接口
 */
public interface  Item {
    public String name();//食物名称
    public Packing packing();//食物包装
    public float price();//食物价格
}
