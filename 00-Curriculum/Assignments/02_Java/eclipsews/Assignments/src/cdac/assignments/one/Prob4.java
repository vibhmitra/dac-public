/* Problem 4: WAP that prompt user to enter marks of 5 subject and show its sum. */
package cdac.assignments.one;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		int marks, totalSubject, totalMarks = 0;
        totalSubject = 5;  // for the marks
       Scanner userInput = new Scanner(System.in);
       
        for (int i = 1; i <= totalSubject; i++) {
            System.out.print("Enter Marks for Subject [" + i + "] : ");
            marks = userInput.nextInt();
            totalMarks += marks;
        }
        
        int avgMarks = totalMarks / totalSubject;
        
        System.out.println("Total Marks : " + totalMarks);
        System.out.println("Avergae Marks : " + avgMarks);
        userInput.close();
	}

}
