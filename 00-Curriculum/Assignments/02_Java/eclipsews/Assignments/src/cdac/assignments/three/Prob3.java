/* 
 * Problem 3: Write a Java program to display the pattern like a right angled triangle of numbers like below: 
 * 1
 * 12
 * 123
 * 1234
 * 12345
 */

package cdac.assignments.three;

public class Prob3 {

	public static void main(String[] args) {
		
		int pHeight = 4;
	    int patterOut = 1;
	    
	    for (int i = 1; i <= pHeight; i++) {
	      for (int j = 0; j < i; j++) {
	        System.out.print(patterOut++);
	      }
	      System.out.println(); // new l ine
	    }
	}
}
