package es.hulk.programacio.lab.les12;

import java.util.ArrayList;

/**
 * Created by Hulk
 * at 19/01/2022
 * Project: CLASE2021
 * Class: Manager
 */

public class Manager extends Employee {

    private ArrayList<Employee> employeeList = new ArrayList<>();

    public Manager() {}

    public void setEmployee(Employee employee){
        employeeList.add(employee);
    }

    public ArrayList<Employee> getEmployees(){
        return employeeList;
    }

    public void displayInformation() {
        Employee emp;
        super.displayInformation();
        System.out.println("Manager has the following employees: ");
        for(Employee obj : employeeList){
            emp = obj;
            System.out.println("\t" + emp.getName());
        }
    }

}
