package in.cdac.collectionframework;

import java.util.ArrayList;

class Student {
	String name;
	int physicsMarks, mathsMarks, chemistryMarks, totalMarks, percentageMarks;
}

class StudentData {
	// declare ArrayList Type
	ArrayList <Student> addData() {
		Student newStudent = new Student();
		newStudent.name = "Rohan";
		newStudent.physicsMarks = 72;
		newStudent.mathsMarks = 89;
		newStudent.chemistryMarks = 90;
		newStudent.totalMarks = newStudent.physicsMarks + newStudent.mathsMarks + newStudent.chemistryMarks;
		newStudent.percentageMarks = (newStudent.totalMarks *100) /  300;
		
		ArrayList <Student> stuList = new ArrayList <Student>();
		stuList.add(newStudent);
		return (stuList);
	}
}


class StudentDataDisplay {
	void fetchStudentData() {
		StudentData sd = new StudentData();
		ArrayList <Student> stuList = sd.addData();
		for (Student s : stuList) {
			System.out.println("Name : " + s.name);
			System.out.println("Maths : " + s.mathsMarks);
			System.out.println("Chemistry : " + s.chemistryMarks);
			System.out.println("Physics : " + s.physicsMarks);
			System.out.println("Total Marks : " + s.totalMarks);
			System.out.println("Percentage : " + s.percentageMarks);
		}
	}
}

public class StudentArrayList {

	public static void main(String[] args) {
		StudentData s = new StudentData();
		
		s.addData();
		StudentDataDisplay display = new StudentDataDisplay();
		display.fetchStudentData();
		

	}

}
