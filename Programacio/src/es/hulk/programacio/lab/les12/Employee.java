package es.hulk.programacio.lab.les12;

/**
 * Created by Hulk
 * at 19/01/2022
 * Project: CLASE2021
 * Class: Employee
 */

public class Employee {

    protected int employeeIDCounter = 0;
    private String name;
    private String jobTitle;
    private int level;
    private int employeeID;

    public void calculateEmployeeID() {
        setEmployeeID(employeeIDCounter++);
    }

    public void displayInformation() {
        System.out.println("Name: " + getName());
        System.out.println("Job Title: " + getJobTitle());
        System.out.println("Employee ID: " + getEmployeeID());
        System.out.println("Level: " + getLevel());
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeeIDCounter(int employeeIDCounter) {
        this.employeeIDCounter = employeeIDCounter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getEmployeeIDCounter() {
        return employeeIDCounter;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getLevel() {
        return level;
    }

    public int getEmployeeID() {
        return employeeID;
    }
}