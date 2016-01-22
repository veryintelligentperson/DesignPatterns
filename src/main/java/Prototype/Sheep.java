package Prototype;

/**
 * Created by michal on 22.01.16.
 */
public class Sheep implements Animal {

    public Sheep() {
        System.out.println("sheep is made   ");
    }

    @Override
    public Animal makeCopy() {
        System.out.println("sheep is being made");
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }


}
