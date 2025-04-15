package in.cdac.SerializationJava;

import java.io.*;

public class StudentMain implements Serializable {
	int rollNumber;
	String name, address;

	public StudentMain(int rollNumber, String name, String address) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;
	}
	
	public void display() {
		System.out.println("Roll Number : " + rollNumber);
		System.out.println("name : " + name);
		System.out.println("Address : " + address);
	}
	

	@Override
	public String toString() {
		return "StudentMain [rollNumber=" + rollNumber + ", name=" + name + ", address=" + address + "]";
	}

	public static void main(String[] args) throws IOException {
		StudentMain student = new StudentMain(101, "Somename", "Somewhere");
		
		FileOutputStream fos = new FileOutputStream("G:\\StudentData\\out.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(student);

		fos.close();
		oos.close();
		
	}

}
