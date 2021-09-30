package es.hulk.programacio.lab.les06.objects;

/**
 * Created by Hulk
 * at 30/09/2021 10:22
 */

public class PersonTwo {

    private final StringBuilder name = new StringBuilder(8);
    private final StringBuilder phoneNumber = new StringBuilder();

    public void displayPersonInfo() {
        name.append("Alonso");
        name.append(" ");
        name.append("Alavaro");

        System.out.println("Name: " + name.toString());
        System.out.println("Name Object Capacity: " + name.capacity());
        System.out.println("First Name: " + name.substring(0, 6));

        System.out.println("------------------------------");

        phoneNumber.append("1234567890");
        phoneNumber.insert(3, "-");
        phoneNumber.insert(7, "-");

        System.out.println("Phone Number: " + phoneNumber.toString());
    }

}
