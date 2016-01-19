package Factory;

/**
 * Created by root on 19.01.16.
 */
public class WarsawPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Sauce createSauce() {
        return new WarsawSauce();
    }

    @Override
    public Cheese createCheese() {
        return new NormalCheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new HotPepperoni();
    }

    @Override
    public Clams createClam() {
        return new Clams();
    }
}
