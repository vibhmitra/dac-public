package in.cdac.person;

public class Student extends Person {

	private int numCourses;
	private String[] courses;
	private int[] grades;
	
	public static final int MAX_COURSES = 10;	// SET MAX COURSE to 10
	
	// Constructor
	Student(String name, String address) {
		super(name, address);	
	}
	
	// Add Course/Grades By Student
	void addCourseGrades(String course, int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
	}
	
	// Printing Grades
	void printGrades() {
		for (int cIndex = 0; cIndex < numCourses; cIndex++ ) {
			System.out.println(courses[cIndex] + " > " + grades[cIndex]);
		}
	}
	
	// Calculates Average Grades
	double getAvgGrades() {
		double total = 0;
		for (int cIndex : grades) {
			total += grades[cIndex];
		}
		return (total / numCourses); 
	}

	@Override
	public String toString() {
		return ("STUDENT : " + super.toString());
	}
}
