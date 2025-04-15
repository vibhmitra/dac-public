/* 
 * Problem 5: Write a Java program to create a class called "Employee" 
 * with their empId, firstName, lastName, gender, email, mobile, age and designation 
 * attribute. 
 * Create two instances/Objects of the "Employee" class, 
 * set their attributes using constructors, and print their details on the screen.
 * Note: Take all the details of Employee Class at run time using Scanner Class
 */

package cdac.assignments.three;

import java.util.Scanner;

public class Prob5 {
	public static class Employee {
		// Deceleration
		int empId, age;
		String firstName, lastName, eMail, mobileNumber;
		char gender;

		// Default Constructor
		Employee() {
			empId = 0;
			firstName = "firstName";
			lastName = "lastName";
			gender = '0';
			age = 0;
			mobileNumber = "0";
			eMail = "email@examplle.com";
		}

		// Constructor to SetValues
		Employee(int empId, String firstName, String lastName, char gender, String eMail, String mobileNumber,
				int age) {
			this.empId = empId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
			this.eMail = eMail;
			this.mobileNumber = mobileNumber;
			this.age = age;
		}

		// Method to Show Details
		void printDetails() {
			System.out.println("\tID : " + empId);
			System.out.println("\tFirst Name : " + firstName);
			System.out.println("\tLast Name : " + lastName);
			System.out.println("\tAge : " + age);
			System.out.println("\tGender : " + gender);
			System.out.println("\tMobile Number : " + mobileNumber);
			System.out.println("\tE-Mail : " + eMail);
		}

	}

	public static void main(String[] args) {
//		Employee emp1 = new Employee();
//		Employee emp2 = new Employee();
		int empId, age;
		String firstName, lastName, eMail, mobileNumber;
		char gender;

		Scanner userIn = new Scanner(System.in);

		// Getting Employee Details | First Instance
		System.out.println("Enter Details for Employee 1 > ");
		System.out.print("ID : ");
		empId = userIn.nextInt();
		System.out.print("First Name : ");
		firstName = userIn.next();
		System.out.print("Last Name : ");
		lastName = userIn.next();
		System.out.print("Age : ");
		age = userIn.nextInt();
		System.out.print("Gender : ");
		gender = userIn.next().charAt(0);
		System.out.print("Mobile Number : ");
		mobileNumber = userIn.next();
		System.out.print("E-Mail : ");
		eMail = userIn.next();

		Employee emp1 = new Employee(empId, firstName, lastName, gender, mobileNumber, eMail, age);

		// Getting Employee Details | Second Instance
		System.out.println("Enter Details for Employee 2 > ");
		System.out.print("ID : ");
		empId = userIn.nextInt();
		System.out.print("First Name : ");
		firstName = userIn.next();
		System.out.print("Last Name : ");
		lastName = userIn.next();
		System.out.print("Age : ");
		age = userIn.nextInt();
		System.out.print("Gender : ");
		gender = userIn.next().charAt(0);
		System.out.print("Mobile Number : ");
		mobileNumber = userIn.next();
		System.out.print("E-Mail : ");
		eMail = userIn.next();

		Employee emp2 = new Employee(empId, firstName, lastName, gender, mobileNumber, eMail, age);

		// Printing Details Using Both Instance of Class
		System.out.println("\nDetails for Employee 1 > ");
		emp1.printDetails();

		System.out.println("\nDetails for Employee 2 >");
		emp2.printDetails();

		userIn.close();
	}
}
