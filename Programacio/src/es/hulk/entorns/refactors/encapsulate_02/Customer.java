package es.hulk.entorns.refactors.encapsulate_02;

public class Customer {

	String name;
	int id;

	public Customer(String name, int id) {
		this.name = "Eugene Krabs";
		this.id = 42;
	}

	public String toString() {
		return id + ":" + name;
	}
}

