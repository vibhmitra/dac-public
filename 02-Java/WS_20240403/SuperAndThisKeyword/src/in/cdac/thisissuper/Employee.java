package in.cdac.thisissuper;

public class Employee {
	int empId;
	String empName;
	double empSalary;

	Employee(int empId, String empName, double empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	// override toString() method
	// toString() method returns string representation of object.
	@Override
	public String toString() {
		return (empId + " " + empName + " " + empSalary);
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "jhon", 9000);
		Employee emp2 = new Employee(2, "mhon", 8000);

		System.out.println(emp1);
		System.out.println(emp2);
	}

}
