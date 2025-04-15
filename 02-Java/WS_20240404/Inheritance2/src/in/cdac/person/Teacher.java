package in.cdac.person;

public class Teacher extends Person {

	private int numCourses;
	private String courses[];

	public static final int MAX_COURSES = 4;

	Teacher(String name, String address) {
		super(name, address);
		numCourses = 0;
		courses = new String[MAX_COURSES];
	}

	boolean addCourse(String course) {
		// checking if course already exist
		for (int cIndex = 0; cIndex < numCourses; cIndex++) {
			if (courses[cIndex].equals(course)) {
				return (false);
			}
		}
		courses[numCourses] = course; // adding course
		numCourses++;
		return true;
	}

	// removing courses
	boolean removeCourse(String course) {
		boolean found = false;
		for (int cIndex = 0; cIndex < numCourses; cIndex++) {
			if (courses[cIndex].equals(course)) {
				for (int i = cIndex; i < numCourses; i++) {
					courses[i] = courses[i + 1];
				}
				numCourses--;
				found = true;
				return (found);
			}
		}
		return (false);
	}

	// print course
	public void printCourses() {
		for (int cIndex = 0; cIndex < numCourses; cIndex++) {
			System.out.println(" Course " + courses[cIndex]);
		}
	}
	
	
	@Override
	public String toString() {
		return ("TEACHER : " + super.toString()); 	// here we are converting the Constructor for Teacher to string which
													// is also Inherited from another super class called Person.
	}
}
