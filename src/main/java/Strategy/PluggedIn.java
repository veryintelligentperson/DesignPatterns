package Strategy;

/**
 * Created by root on 20.01.16.
 */
public class PluggedIn implements Remote {
    @Override
    public boolean isRemote() {
        return false;
    }
}
