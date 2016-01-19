package Factory;

/**
 * Created by root on 19.01.16.
 */
public class app {
    public static void main(String[] args) {

        PizzaStore wroclawStore = new WroclawPizzaStore();
        PizzaStore warsawStore = new WarsawPizzaStore();

        warsawStore.orderPizza("veggie");
        wroclawStore.orderPizza("clam");
    }
}
