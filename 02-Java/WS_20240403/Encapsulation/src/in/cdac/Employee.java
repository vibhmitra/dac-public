package in.cdac;

public class Employee {

	private String empName;
	private int empId;
	private String companyName;
	
	// all getter and setter must be declared public.
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	Employee(String name, int id, String company) {
		this.empName = name;
		this.empId = id;
		this.companyName = company;
	}
}
		
class EmployeeClass {
	public static void main(String[] agrs) {
		Employee emp = new Employee("John", 1, "ABC");
		String name = emp.getEmpName();
		int id = emp.getEmpId();
		String cName = emp.getCompanyName();
		
		System.out.print(name + ' ' + id + ' ' + cName);
	}	
}