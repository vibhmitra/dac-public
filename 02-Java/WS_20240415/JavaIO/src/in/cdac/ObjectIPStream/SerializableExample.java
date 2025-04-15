package in.cdac.ObjectIPStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String rootPath = "G:\\CDAC\\Curriculum\\2-Practice\\Java\\Workspace\\JavaIO\\data\\";
		String packageDir = "ObjectIPStream_EmployeeSerializable\\";
		String fullPath = rootPath + packageDir;
		
		
		
		Employee e = new Employee();
		e.empID = 101;
		e.empName = "Erza";
		e.dateOfJoining = "2024-04-12";
		e.empSalary = 30000;
		e.empLocation = "Somewhere";
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fullPath + "EmployeeData.dat"));

		oos.writeObject(e);
		
		oos.flush();
		oos.close();
		System.out.println("Data written to the File successfully | USING SERIALIZATION");

	}

}
