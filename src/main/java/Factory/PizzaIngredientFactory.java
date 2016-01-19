package Factory;

/**
 * Created by root on 19.01.16.
 */
public interface PizzaIngredientFactory {

    Sauce createSauce();
    Cheese createCheese();
    Pepperoni createPepperoni();
    Clams createClam();
}
