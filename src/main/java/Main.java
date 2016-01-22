import AbstractFactory.PizzaStore;
import AbstractFactory.WarsawPizzaStore;
import AbstractFactory.WroclawPizzaStore;
import Prototype.CloneFactory;
import Prototype.Sheep;
import Strategy.*;

/**
 * Created by root on 19.01.16.
 */
public class Main {
    public static void main(String[] args) {

        CloneFactory animalMaker = new CloneFactory();
        Sheep someSheep = new Sheep();
        Sheep clonedSheep = (Sheep) animalMaker.getClone(someSheep);
        System.out.println(someSheep.equals(clonedSheep));

    }
}
