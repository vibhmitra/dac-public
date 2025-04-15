package in.cdac.SerializationJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentDsr {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("G:\\StudentData\\out.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		StudentMain student =  (StudentMain)ois.readObject();
		student.display();
		
		fis.close();
		ois.close();
	}

}
