package es.hulk.programacio.lab.les05.objects;

import java.util.Date;

/**
 * Created by Hulk
 * at 30/09/2021 9:38
 */

public class Customer {

    private int customerID = 192;
    private char stauts = 'N';
    private double totalPurchases = 27.40;

    public Customer() {}

    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + this.customerID);
        System.out.println("Status: " + this.stauts);
        System.out.println("Total Purchases: " + this.totalPurchases);
    }
}
