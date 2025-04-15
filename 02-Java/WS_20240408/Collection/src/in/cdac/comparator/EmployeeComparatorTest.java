package in.cdac.comparator;
import java.util.*;

class Employee {
	int empID;
	String empName;
	
	public Employee(int empID, String empName) {
		super();
		this.empID = empID;
		this.empName = empName;
	}
}

class EmpNameWise implements Comparator <Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		String nameOne = o1.empName;
		String nameTwo = o2.empName;
		return nameOne.compareTo(nameTwo);
	}
}

class EmpIdWise implements Comparator <Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		Integer idOne = o1.empID;
		Integer idTwo = o2.empID;
		return idOne.compareTo(idTwo);
	}
}

public class EmployeeComparatorTest {

	static void displayData(ArrayList <Employee> employeeList) {
		for(Employee employee : employeeList) {
			System.out.println("ID : " + employee.empID + ", Name : " + employee.empName);
		}
	}
	
	public static void main(String[] args) {
		ArrayList <Employee> employeeList = new ArrayList <>();
		employeeList.add(new Employee(101, "Son"));
		employeeList.add(new Employee(104, "Rin"));
		employeeList.add(new Employee(109, "Aon"));
		employeeList.add(new Employee(108, "Sin"));
		
		EmpIdWise empIdWise = new EmpIdWise();
		EmpNameWise empNameWise = new EmpNameWise();
		
		System.out.println("Employee (No Sorting) > ");
		displayData(employeeList);
		
		// sorting list via ID wise
		System.out.println("Employee (Sorted ID Wise) > ");
		Collections.sort(employeeList, empIdWise);
		displayData(employeeList);
		
		// sorting list via ID wise
		System.out.println("Employee (Sorted Name Wise) > ");
		Collections.sort(employeeList, empNameWise);
		displayData(employeeList);
	}

}
