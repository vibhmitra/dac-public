package in.cdac.person;

public class MainClass {

	public static void main(String[] args) {
		
		Student student1 = new Student("Vibhanshu", "Allahabad");
		System.out.println(student1);
		student1.addCourseGrades("A", 40);
		student1.addCourseGrades("B", 20);
		student1.addCourseGrades("C", 10);

		student1.printGrades();
		System.out.println(" Average : " + student1.getAvgGrades());
		
		Teacher teacher1 = new Teacher("Ooooo", "Delhi");
		System.out.println(teacher1);
		
		String[] toAddCourses = {"A", "B", "A", "C"};
		for (String iCourse : toAddCourses) {
			if (teacher1.addCourse(iCourse))
				System.out.println(" Course " + iCourse + " ADDED SUCCESSFULLY");
			else
				System.out.println(" Course " + iCourse + " NOT ADDED, FAILED!");
		}
		
		System.out.println("***********");
		
		String[] rCourses = {"A"};
		for (String iCourse : rCourses) {
			if (teacher1.removeCourse(iCourse))
				System.out.println(" Course " + iCourse + " REMOVED");
			else
				System.out.println(" Course " + iCourse + " NOT FOUND TO REMOVE");
		}
		
		teacher1.printCourses();
	}

}
