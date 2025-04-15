package in.cdac.SerializationJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationArray {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		String rootPath = "G:\\CDAC\\Curriculum\\2-Practice\\Java\\Workspace\\JavaIO\\data\\";
		String packageDir = "SerializationArray\\";
		String fullPath = rootPath + packageDir;
		
		int[] numbers = {10,20,70,45,34};
		String[] str = {"Jon", "kat", "Elen"};
		
		// create Output Stream object
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fullPath + "serialization.dat", true));
		
		// write array objects
		oos.writeObject(numbers);
		oos.writeObject(str);
		
		oos.flush();
		oos.close();
		
		
		// creating Input stream object
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fullPath + "serialization.dat"));
		
		// reading array object
		int[] rNumbers = (int []) ois.readObject();
		String[] rString = (String []) ois.readObject();
		
		System.out.print("Printing Integer Array : ");
		for (int n : rNumbers) {
			System.out.print(n + " ");
		}
		
		System.out.print("\nPrinting String Array : ");
		for (String s : rString) {
			System.out.print(s + " ");
		}
		
		

	}

}
