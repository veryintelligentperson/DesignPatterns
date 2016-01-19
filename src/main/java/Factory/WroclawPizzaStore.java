package Factory;

/**
 *
 * Created by root on 19.01.16.
 */
public class WroclawPizzaStore extends PizzaStore {

    PizzaIngredientFactory pizzaIngredientFactory = new WroclawPizzaIngredientFactory();

    @Override
    public Pizza createPizza(String type){
        Pizza pizza = null;
        switch (type) {
            case "clam":
                pizza = new ClamPizza(pizzaIngredientFactory);
                break;
            case "veggie":
                pizza = new VeggiePizza(pizzaIngredientFactory);
                break;
        }
        return pizza;
    }
}
