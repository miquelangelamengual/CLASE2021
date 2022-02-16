package es.hulk.programacio.labs2.lab02;

import es.hulk.programacio.utils.Utils;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee jane = new Employee();
        jane.setEmployeeID(101);
        jane.setName("Jane Smith");
        jane.setSocialNumber("012-34-4567");
        jane.setSalary(120_345.27);

        System.out.println("Employee ID: " + jane.getEmployeeID());
        System.out.println("Employee Name: " + jane.getName());
        System.out.println("Employee Social Number: " + jane.getSocialNumber());
        System.out.println("Employee Salary: " + jane.getSalary());
    }

}
