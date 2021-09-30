package es.hulk.programacio.lab.les06;

import es.hulk.programacio.lab.les06.objects.Customer;

/**
 * Created by Hulk
 * at 30/09/2021 10:15
 */

public class CustomerTest {

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();

        customer1.customerID = 11;
        customer1.emailAddress = "hola@hola.com";
        customer1.name = "Hawk";

        customer1.displayCustomerInfo();

        customer2.customerID = 10;
        customer2.emailAddress = "jawhd@aaawda.awd";
        customer2.name = "Armando Paredes";

        customer2.displayCustomerInfo();
    }

}
