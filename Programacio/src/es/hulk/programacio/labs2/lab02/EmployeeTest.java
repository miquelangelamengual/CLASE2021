package es.hulk.programacio.labs2.lab02;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee jane = new Employee();
        jane.setName("Jane Smith");

        System.out.println("Employee ID: " + jane.getEmployeeID());
        System.out.println("Employee Name: " + jane.getName());
        System.out.println("Employee Social Number: " + jane.getSocialNumber());
        System.out.println("Employee Salary: " + jane.getSalary());
    }

}
