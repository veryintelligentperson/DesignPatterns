package Adapter;

/**
 * Created by michal on 03.02.16.
 */
public class EmployeeAdapterLdap implements Employee{

    private EmployeeLdap instance;

    public EmployeeAdapterLdap(EmployeeLdap instance){
        this.instance = instance;
    }

    public String getId() {
        return instance.getCn();
    }

    public String getFirstName() {
        return instance.getGivenName();
    }

    public String getLastName() {
        return instance.getSurname();
    }

    public String getEmail() {
        return instance.getMail();
    }
}
