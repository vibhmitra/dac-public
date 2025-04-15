package in.cdac.collectionframework;

import java.util.*;

class Employee {
	int empNo;
	String name, address;
	
	public Employee() {}
	public Employee(int empNo, String name, String address) {
		this.empNo = empNo;
		this.address = address;
		this.name = name;
	}
	
	void displayData(ArrayList<Employee> al) { 
		System.out.println("Employee Details >> ");
		for (Employee e : al) {
			System.out.println("Employee ID : " + e.empNo);
			System.out.println("Employee Name : " + e.name);
			System.out.println("Employee Address : " + e.address);
		}
	}
}


public class EmployeeData {

	
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Mike R.", "Somewhere");
		Employee e2 = new Employee(102, "Oman C.", "Delhi");
		Employee e3 = new Employee(103, "Roman N.", "Noida");

		ArrayList<Employee> al = new ArrayList <Employee>();
		
		// adding employees to array list
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		Employee employee = new Employee();
		employee.displayData(al);
		
		// deleting a record
		al.remove(1);
		System.out.println("\nAfter Removing :: ");
		
		employee.displayData(al);

		// deleting all record
		al.clear();
		System.out.println("\n\nAfter Deleting All Record >>> ");
		System.out.println(al);
		
		
	}

}
