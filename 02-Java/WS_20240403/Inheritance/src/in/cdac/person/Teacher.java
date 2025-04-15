package in.cdac.person;

public class Teacher extends Person {

	private int numCourses;
	private String courses[];

	public static final int MAX_COURSES = 10;

	Teacher(String name, String address) {
		super(name, address);
	}

	boolean addCourse(String course) {
		return false;
	}

	boolean removeCourse(String course) {
		return false;
	}

	@Override
	public String toString() {
		return ("TEACHER : " + super.toString()); 	// here we are converting the Constructor for Teacher to string which
													// is also Inherited from another super class called Person.
	}
}
