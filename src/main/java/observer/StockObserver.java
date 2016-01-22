package observer;

/**
 * Created by michal on 22.01.16.
 */
public class StockObserver implements Observer {

    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    private static int observerTrackerId = 0;

    private int observerId;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerId = ++observerTrackerId;
        System.out.println("New observer " + this.observerId);
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double applePrice, double googlePrice) {
        this.ibmPrice = ibmPrice;
        this.applePrice = applePrice;
        this.googlePrice = googlePrice;
    }

    public void printThePrices(){
        System.out.println(observerId + "\nIBM: " + ibmPrice + "\nAAPL: " + applePrice +
        "\nGOOG: " + googlePrice + "\n");
    }
}
