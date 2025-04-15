package in.cdac.person;

public class Student extends Person {

	private int numCourses;
	private String[] courses;
	private int[] grades;
	
	public static final int MAX_COURSES = 10;	// SET MAX COURSE to 10
	
	// Constructor
	Student(String name, String address) {
		super(name, address);	// sending name address to Super Class Person
		numCourses = 0;
		courses = new String[MAX_COURSES];
		grades = new int[MAX_COURSES];
	}
	
	// Add Course/Grades By Student
	public void addCourseGrades(String course, int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		numCourses++;
	}
	
	// Printing Grades
	public void printGrades() {
		for (int cIndex = 0; cIndex < numCourses; cIndex++ ) {
			System.out.println(" > Course : " + courses[cIndex] + " | Grade : " + grades[cIndex]);
		}
	}
	
	// Calculates Average Grades
	public double getAvgGrades() {
		double total = 0;
		for (int cIndex = 0; cIndex < numCourses; cIndex++) {
			total += grades[cIndex];
		}
		return (total / numCourses); 
	}

	@Override
	public String toString() {
		return ("STUDENT : " + super.toString());
	}
}
