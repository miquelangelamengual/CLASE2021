package es.hulk.entorns.refactors.consolidateconditional_13;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Invoice {

	private Customer customer;
	private int year;

	public Invoice(Customer customer, int year) {
		this.customer = customer;
		this.year = year;
	}

	public float calculateTotal(float subtotal, float vat) {
		if (customer.getAge() < 18)
			return 0;
		if (new GregorianCalendar().get(Calendar.YEAR) > year)
			return 0;
		if (subtotal < 0.5f)
			return 0;

		return subtotal * vat;
	}
}
