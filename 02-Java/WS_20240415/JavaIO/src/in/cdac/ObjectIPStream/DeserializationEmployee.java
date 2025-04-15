package in.cdac.ObjectIPStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializationEmployee {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		String rootPath = "G:\\CDAC\\Curriculum\\2-Practice\\Java\\Workspace\\JavaIO\\data\\";
		String packageDir = "ObjectIPStream_EmployeeSerializable\\";
		String fullPath = rootPath + packageDir;
		
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fullPath + "EmployeeData.dat"));
		
		Object obj = ois.readObject();		// reading objects and stroing the object using object class.
		
		Employee e = (Employee) obj;	// converting object to Employee type
		
		// display
		System.out.println("Name : " + e.empName);
		System.out.println("ID : " + e.empID);
		System.out.println("Date of Joining : " + e.dateOfJoining);
		System.out.println("Salary : " + e.empSalary);

	}

}
