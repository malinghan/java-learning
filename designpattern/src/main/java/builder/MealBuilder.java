package builder;

/**
 * Created by mlh on 2017/12/24.
 */

/**
 * 实际的 builder 类负责创建 Meal 对象
 */
public class MealBuilder {
    //构造不同的实例对象
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
