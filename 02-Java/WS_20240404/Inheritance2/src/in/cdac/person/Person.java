package in.cdac.person;

public class Person {
	private String name;
	private String address;
	
	// Constructor for Initialization
	Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	// getter setter
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return (name + " (" + address + ") ");
	}
}
