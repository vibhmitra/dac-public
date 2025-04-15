package in.cdac.ObjectIPStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class TestObjInputStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String rootPath = "G:\\CDAC\\Curriculum\\2-Practice\\Java\\Workspace\\JavaIO\\data\\";
		String packageDir = "TestObjectInputStream\\";
		String fullPath = rootPath + packageDir;
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// for writing data object
		FileOutputStream fos = new FileOutputStream(fullPath + "myfile.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
	
		oos.writeUTF("Vibhanshu");
		oos.writeBoolean(true);
		oos.writeInt(1410);
		oos.writeDouble(5.2);
		oos.writeObject(new java.util.Date());
		
		// for reading objects
		FileInputStream fis = new FileInputStream(fullPath + "myfile.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		System.out.println("Name : " + ois.readUTF());
		System.out.println("Human? : " + ois.readBoolean());
		System.out.println("DOB : " + ois.readInt());
		System.out.println("Double : " + ois.readDouble());
		System.out.println("Date : " + (Date) ois.readObject());
		
		oos.close();
		ois.close();
		ois.close();
		fis.close();
	}

}
