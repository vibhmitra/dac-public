package in.cdac.comparable;

import java.util.Arrays;
import java.util.Scanner;

class Employee implements Comparable<Employee> {
	String empName;
	double empSalary;
	public Employee(String empName, double empSalary) {
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	@Override
	public int compareTo(Employee employee) {
		if(empSalary == employee.empSalary)
			return 0;
	
		else if (empSalary > employee.empSalary)
			return 1;
		else
			return -1;
	}
	
}


public class EmployeeMain {

	public static void main(String[] args) {
		Employee[] employee;
		employee = new Employee[3];
		
		employee[0] = new Employee("B", 14323.0);
		employee[1] = new Employee("A", 19323.0);
		employee[2] = new Employee("C", 11323.0);
		
		Scanner in = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			employee[i].empName = in.next();
			employee[i].empSalary = in.nextDouble();
		}
		
		Arrays.sort(employee);
		
		for (Employee e : employee) {
			System.out.println(e.empName);
			System.out.println(e.empSalary);
		}
	}

}
