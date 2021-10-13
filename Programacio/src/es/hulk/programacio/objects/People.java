package es.hulk.programacio.objects;

/**
 * Created by Hulk
 * at 13/10/2021 8:37
 */

public class People {

    private String name;
    private int age;
    private String dni;
    private String sexType;
    private int telephoneNumber;

    public People() {
    }

    public People(String name, int age, String dni, String sexType, int telephoneNumber) {
        this.name = name;
        this.age = age;
        this.dni = dni;
        this.sexType = sexType;
        this.telephoneNumber = telephoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getSexType() {
        return sexType;
    }

    public void setSexType(String sex) {
        this.sexType = sex;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void display() {
        System.out.println("============================");
        System.out.println("Person: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Sex Type: " + getSexType());
        System.out.println("DNI: " + getDni());
        System.out.println("Telephone: " + getTelephoneNumber());
        System.out.println("============================");
    }
}
