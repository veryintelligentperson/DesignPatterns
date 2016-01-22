package observer;

/**
 * Created by michal on 22.01.16.
 */
public interface Subject {
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObserver();
}
