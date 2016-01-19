import AbstractFactory.PizzaStore;
import AbstractFactory.WarsawPizzaStore;
import AbstractFactory.WroclawPizzaStore;
import Strategy.*;

/**
 * Created by root on 19.01.16.
 */
public class Main {
    public static void main(String[] args) {

        ElectronicDevice telewizor = new Tv();
        ElectronicDevice telefon = new MobilePhone();

        System.out.println(telewizor.getName() + " is remote: " + telewizor.isRemote());
        System.out.println(telefon.getName() + " is remote: " + telefon.isRemote() + "\n");
        telewizor.setRemote(new Charged());
        System.out.println(telewizor.getName() + " is remote: " + telewizor.isRemote());

    }
}
