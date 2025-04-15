package in.cdac.set;

import java.util.*;

class Student {
	String name;
	int rollNumber;
	
	public Student() {}
	
	public Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + "]";
	}
	
	
	
//	void displayData(HashSet<Student> s) {
//		for (Student student : s) {
//			System.out.println("Name : " + student.name);
//			System.out.println("Roll No : " + student.rollNumber);
//		}
//	}
	
}


public class HashSetTest {

	public static void main(String[] args) {
		HashSet <Student> s = new HashSet <>(); // <> this here is called Diamond Syntax | Here it is same as writing HashSet <Student>();
		Student std1 = new Student("Mike", 3);
		Student std2 = new Student("Roha", 4);
		Student std3 = new Student("John", 5);
		
		s.add(std1);
		s.add(std2);
		s.add(std3);
		s.add(new Student("Vibh", 6));		// explicitly adding data to HashSet Object without Class Object
		DisplayHashSet(s);					// displaying a local method | student Hash set
	}
	
	static void DisplayHashSet(HashSet <Student> studentsList) {
		for (Student student : studentsList) {
			System.out.println("Name : " + student.name);
			System.out.println("Roll No : " + student.rollNumber);
		}
		
		// the same thing is happening here too but with the help of iterator
		 Iterator<Student> it = studentsList.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
	}

}
