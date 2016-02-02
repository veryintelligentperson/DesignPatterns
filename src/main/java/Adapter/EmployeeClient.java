package Adapter;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by michal on 03.02.16.
 */
public class EmployeeClient {

    public List<Employee> getEmployeeList(){
        List<Employee> employees = Lists.newArrayList();
        Employee employeeFromDb = new EmployeeDB("1234", "John", "Wick", "johnwick@gmail.com");
        employees.add(employeeFromDb);
        EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "solo", "Han", "han.solo@gmail.com");
        employees.add(new EmployeeAdapterLdap(employeeFromLdap));
        return employees;
    }
}
