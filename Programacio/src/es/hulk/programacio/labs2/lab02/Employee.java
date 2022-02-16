package es.hulk.programacio.labs2.lab02;

import lombok.Data;

public class Employee {

    private int employeeID;
    private String name;
    private String socialNumber;
    private double salary;

    public Employee() {
    }

    public Employee(int employeeID, String name, String socialNumber, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.socialNumber = socialNumber;
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialNumber() {
        return socialNumber;
    }


    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double increase) {
        this.salary += increase;
    }
}
