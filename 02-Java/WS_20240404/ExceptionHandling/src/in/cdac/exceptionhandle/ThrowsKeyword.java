package in.cdac.exceptionhandle;
import java.io.*;

//@SuppressWarnings("serial")
//class MyException extends Exception {
//	public MyException(String str) {
//		super(str);
//	}
//}


public class ThrowsKeyword {

	private String firstName, lastName;
	//private int age;
	void acceptDetails() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		
		System.out.println("firstName : ");
		firstName = bfr.readLine();
		System.out.println("lastName : ");
		lastName = bfr.readLine();
		
//		System.out.println("age : ");
//		age = Integer.parseInt(bfr.readLine());
	}
	
	void showDetails() {
		System.out.println("firstName : " + firstName + '\n' + "lastName : " + lastName );
	}
	
	public static void main(String[] args) throws IOException {
		ThrowsKeyword tk = new ThrowsKeyword();
		tk.acceptDetails();
		tk.showDetails();
	}

}
