package in.cdac.exceptionhandle;
import java.util.Scanner;


@SuppressWarnings("serial")
class MyException extends Exception {
	public MyException(String str) {
		super(str);
	}
}

public class SquareCalculator {
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("Num (<100) : ");
			int num = input.nextInt();
			if (num >= 100)
				throw new MyException("Enter Num Less Than 100 :(");
			else
				System.out.println("Square : " + num * num);
		} catch (Exception e) {
			System.out.println("User Defined Exception : " + e.getMessage());
		}
		
	}

}
