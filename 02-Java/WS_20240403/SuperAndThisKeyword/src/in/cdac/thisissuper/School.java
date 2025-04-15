package in.cdac.thisissuper;

class Student {
	int studentId = 101;
	
	Student() {
		System.out.println("Default Parent Class Constructor");
	}
	Student(int id) {
		studentId = id;
	}
	
	// Overridden Method
	void displayInfo() {
		System.out.println("I am Stud!");
	}
}
	
public class School extends Student {
	School() {
		super(12);	// calling parent class default constructor, this is basically invoked automatically
//		super.super(2); Invalid
		System.out.println("Child Class Default Constructor");
	}
	
	
	int studentId = 201;
	void displayInfo() {	// overriding displayInfo() method of super class Student
		super.displayInfo();
		System.out.println("I am Stu at ABCDEFGH");
		System.out.println("Student ID : " + studentId);
		System.out.println("Student ID : " + super.studentId);
	}
	
	void msg() {
		displayInfo();	// Call the School Class method
	}
	public static void main(String[] args) {
		
		School sc = new School();
		sc.msg();
	}

}


