package AbstractFactory;

/*
 * Created by root on 19.01.16.
 */
public class WroclawPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Sauce createSauce() {
        return new WroclawSauce();
    }

    @Override
    public Cheese createCheese() {
        return new NormalCheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new MildPepperoni();
    }

    @Override
    public Clams createClam() {
        return new Clams();
    }
}
