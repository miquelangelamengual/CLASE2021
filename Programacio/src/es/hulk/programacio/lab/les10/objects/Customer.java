package es.hulk.programacio.lab.les10.objects;

/**
 * Created by Hulk
 * at 06/10/2021 8:46
 */

public class Customer {

    public int customerID = 0;
    public String name = "-name required-";
    public String address = "-address required-";
    public String phoneNumber = "-phoneNumber required-";
    public String eMail = "-email required-";

    public void setCustomerInfo(int id, String nm, String addr, String phone) {
        this.customerID = id;
        this.name = nm;
        this.address = addr;
        this.phoneNumber = phone;
    }

    public void setCustomerInfo(int id, String nm, String addr, String phone, String mail) {
        this.customerID = id;
        this.name = nm;
        this.address = addr;
        this.phoneNumber = phone;
        this.eMail = mail;
    }

    public void display() {
        System.out.println("CustomerID: " + customerID);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("PhoneNumber: " + phoneNumber);
        System.out.println("eMail: " + eMail);
        System.out.println();
    }

}
