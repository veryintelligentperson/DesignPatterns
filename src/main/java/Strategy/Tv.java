package Strategy;

/**
 * Created by root on 19.01.16.
 */
public class Tv extends ElectronicDevice {

    public Tv() {
        setName("Samsung");
        setRemote(new PluggedIn());
    }

    public void changeChannel(){
        System.out.println("changing channel...");
    }

}
