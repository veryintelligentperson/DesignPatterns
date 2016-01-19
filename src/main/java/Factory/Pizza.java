package Factory;

/**
 * Created by root on 19.01.16.
 */
public abstract class Pizza {

    Sauce sauce;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;


    abstract void prepare();
    abstract void bake();
    abstract void cut();
    abstract void box();
}
