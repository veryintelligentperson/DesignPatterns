package Strategy;

/**
 * Created by root on 19.01.16.
 */
public class ElectronicDevice {

    public String name;
    public String type;
    public Boolean isNoisy;
    public Double weight;
    public Remote remote;

    public void setRemote(Remote remote) {
        this.remote = remote;
    }

    public boolean isRemote(){
       return remote.isRemote();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getNoisy() {
        return isNoisy;
    }

    public void setNoisy(Boolean noisy) {
        isNoisy = noisy;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
