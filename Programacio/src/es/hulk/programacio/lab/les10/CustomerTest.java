package es.hulk.programacio.lab.les10;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import es.hulk.programacio.lab.les10.objects.Customer;

/**
 * @author Administrator
 */
public class CustomerTest {

    public static void main(String args[]) {
        Customer customer = new Customer();
        Customer customer2 = new Customer();
        customer.setCustomerInfo(1, "This is my name", "cartgineses 4", "186897", "hola@awd.com");
        customer2.setCustomerInfo(2, "Mw own Name", "avenida principal 2", "56785765");
        customer.display();
        customer2.display();
    }
}
