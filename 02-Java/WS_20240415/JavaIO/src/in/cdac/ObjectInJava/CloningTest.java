package in.cdac.ObjectInJava;

class EmployeeCS implements Cloneable{
	String empName;
	
	public EmployeeCS(String empName) {
		super();
		this.empName = empName;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public Object clone() throws CloneNotSupportedException {
		EmployeeCS e = null;
		e = (EmployeeCS) super.clone(); 
		return e;
	}
}


public class CloningTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		EmployeeCS employee = new EmployeeCS("Marisa");
		
		EmployeeCS employeeclone = (EmployeeCS) employee.clone();		/// deep clone
		System.out.println("Original Name : " + employee.empName);
		System.out.println("Cloned Name : " + employeeclone.empName);
		
		//employee.setEmpName("Mariko");
		employeeclone.setEmpName("Mariko");
		
		System.out.println("Original Name : " + employee.empName);
		System.out.println("Cloned Name : " + employeeclone.empName);

	}

}
