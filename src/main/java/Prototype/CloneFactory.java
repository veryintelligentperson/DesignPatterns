package Prototype;

/**
 * Created by michal on 22.01.16.
 */
public class CloneFactory {

    public Animal getClone(Animal animal){
        return animal.makeCopy();
    }
}
