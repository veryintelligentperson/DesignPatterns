package AbstractFactory;


public class WarsawPizzaStore extends PizzaStore {

    WarsawPizzaIngredientFactory pizzaIngredientFactory = new WarsawPizzaIngredientFactory();

    @Override
    public Pizza createPizza(String type){
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new CheesePizza(pizzaIngredientFactory);
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                break;
        }
        return pizza;
    }
}
