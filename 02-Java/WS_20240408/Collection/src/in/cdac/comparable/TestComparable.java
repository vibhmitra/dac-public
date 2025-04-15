package in.cdac.comparable;

import java.util.*;

class Student implements Comparable<Student> {
	String name;
	int rollNumber;
	int age;
	
	public Student(String name, int rollNumber, int age) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.age = age;
	}

	@Override
	public int compareTo(Student stObj) {
		if(rollNumber == stObj.rollNumber) {
			return 0;
		}
		else if (rollNumber > stObj.rollNumber)
			return 1;
		else
			return -1;
	}
}


public class TestComparable {

	public static void main(String[] args) {
		Student s1 = new Student("Roha", 111, 20);
		Student s2 = new Student("Moha", 103, 19);
		Student s3 = new Student("Soha", 103, 18);
		Student s4 = new Student("Zoha", 110, 23);

		ArrayList <Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		// Display
		System.out.println("Displaying Students (Sorted by Roll Number)");
		Collections.sort(al);		// here sort is using CompareTo method in bg.
		for (Student student: al ) {
			System.out.println(student.rollNumber + " " +  student.name + " " + student.age);
		}
	}

}
