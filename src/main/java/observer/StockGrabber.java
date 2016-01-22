package observer;

import java.util.ArrayList;

/**
 * Created by michal on 22.01.16.
 */
public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double applePrice;
    private double ibmPrice;
    private double googlePrice;

    public StockGrabber() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        System.out.println(o.toString() + " deleted");
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(ibmPrice, applePrice, googlePrice));
    }

    public void setApplePrice(double applePrice) {
        this.applePrice = applePrice;
        notifyObserver();
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setGooglePrice(double googlePrice) {
        this.googlePrice = googlePrice;
        notifyObserver();
    }
}
