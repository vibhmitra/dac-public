package in.cdac.SerializationJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class EmployeeMS implements Serializable{
	private static final long serialVersionUID = 1L;
	
	EmployeeMS () {}
	
	int empID;
	String empName;
	public EmployeeMS(int empID, String empName) {
		super();
		this.empID = empID;
		this.empName = empName;
	}
	
}

class CustomerMS implements Serializable{
	private static final long serialVersionUID = 1L;
	
	CustomerMS(){}
	
	int cId ;
	String cName;
	public CustomerMS(int cId, String cName) {
		super();
		this.cId = cId;
		this.cName = cName;
	}
	
}

public class MultipleObjectSerialization {
	
	public static void WriteDataToFile(List objectList, String fileName) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
		oos.writeObject(objectList);
		oos.close();
	}
	
	public static void ReadDataFromFile(List objectList, String fileName) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
		// do something
		//List<Object> input = (List<Object>) ois.readObject();
		List<Object> checkList = new ArrayList<>();
		for (Object obj : objectList) {
			checkList.add(obj.getClass().getSimpleName());
			if (obj instanceof EmployeeMS) {
				EmployeeMS e = (EmployeeMS) obj;
				//print
			}
			if (obj instanceof CustomerMS) {
				CustomerMS c = (CustomerMS) obj;
				// print
			}
		}
		ois.close();
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String rootPath = "G:\\CDAC\\Curriculum\\2-Practice\\Java\\Workspace\\JavaIO\\data\\";
		String packageDir = "MultipleObjectSerialization\\";
		String fullPath = rootPath + packageDir;
		
		EmployeeMS e = new EmployeeMS(101, "Hinata");
		CustomerMS c = new CustomerMS(901, "Mikasa");
		
		// adding objects to object list
		List<Object> objectList = new ArrayList<>();
		objectList.add(e);
		objectList.add(c);
		
		WriteDataToFile(objectList, fullPath + "data.dat");
		
	}

}
