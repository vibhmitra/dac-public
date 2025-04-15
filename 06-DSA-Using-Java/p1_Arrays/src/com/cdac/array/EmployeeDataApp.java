package com.cdac.array;

class Person {
	private String firstName;
	private String lastName;
	private int age;

	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	// display Person Data
	public void displayPerson() {
		System.out.print("First Name : " + firstName + ", ");
		System.out.print("Last Name : " + lastName + ", ");
		System.out.print("Age : " + age + " \n");
	}

	public String getLastName() {
		return lastName;
	}

	public String getfirstName() {
		return firstName;
	}
	
	public void notFoundError() {
		System.out.println("Record Not Found!");
	}
}
// EO Class Person

class PersonDataArray {
	private Person[] person; 	// creating an Person Type array
	private int recordIndex;	// to store index value of record

	public PersonDataArray(int noOfRecords) {
		person = new Person[noOfRecords];
		recordIndex = 0;
	}

	// insert data
	public void insertData(String fName, String lname, int age) {
		try {
			person[recordIndex] = new Person(fName, lname, age);
			recordIndex++;
			System.out.println("Record No " + recordIndex + " Added Successfully.");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Record No " + (recordIndex + 1) + " Not Inserted. [Reason: Outta Rage.]");
		}
	}

	// Display Person Array
	public void displayPersonArray() {
		for (int i = 0; i < recordIndex; i++) {
			person[i].displayPerson();
		}
	}

	// search by firstName
	public Person getByFirstName(String firstNameToSearch) {
		System.out.println("Searching Record (by First Name)...");
		for (int i = 0; i < recordIndex; i++) {
			if (person[i].getfirstName().equals(firstNameToSearch)) {
				System.out.println("Found!");
				return (person[i]);
			}
		}
		return (null);
	}

	// delete by lastName
	public boolean deletePerson(String firstName) {
		System.out.println("Searching for Record " + firstName);
		int i;
		for (i = 0; i < recordIndex; i++) {
			if (person[i].getfirstName().equals(firstName)) {
				break;
			}
		}
		if (i == recordIndex) {
			System.out.println("Can't Delete, We don't have " + firstName + "'s Data Yet.");
			return false;
		} else {
			for (int j = i; j < recordIndex - 1; j++) {
				person[j] = person[j + 1];
			}
			recordIndex--;
		}
		System.out.println("Record Deleted Successfully!");
		return true;
	}
}
// END OF CLASS `PersonDataArray`

// Main Class
public class EmployeeDataApp {

	public static void main(String[] args) {
		PersonDataArray data = new PersonDataArray(4);	// pre-defining the size of array.
		
		// Inserting Data
		data.insertData("Ren", "Zee", 12);			
		data.insertData("Jen", "Igno", 22);
		data.insertData("Mig", "Igno", 22);
		data.insertData("Mei", "Lu", 20);
		data.insertData("Mei", "Lu", 20);
		
		// Printing the whole list
		data.displayPersonArray();

		// Search Person By First Name
		data.getByFirstName("Mig").displayPerson(); // [Note** - Here we are accessing method of Person Class]
		
		// deleting Person
		data.deletePerson("Jeny");
		data.displayPersonArray();

	}

}
