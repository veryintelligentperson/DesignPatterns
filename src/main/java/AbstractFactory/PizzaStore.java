package AbstractFactory;

/**
 * Created by root on 19.01.16.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println(type + " pizza is coming");
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
