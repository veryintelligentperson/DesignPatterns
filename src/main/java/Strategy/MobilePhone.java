package Strategy;

/**
 * Created by root on 20.01.16.
 */
public class MobilePhone extends ElectronicDevice {

    public MobilePhone() {
        setName("Iphone");
        setRemote(new Charged());
    }

    public void phone(){
        System.out.println("Dialing the number...");
    }
}
