package in.cdac.exceptionhandle;

public class Class1 {

	public static void main(String[] args) {
		try {
//			System.out.println(200/0);		// ArthmeticException only works with Integer
			System.out.println(10/0.0);
			System.out.println(0/0);
//			System.exit(0);	// this will stop finally block from executing
//			return; 		// same
			
			// Nested Try-catch thing-
//			try {
//					System.out.println(1/0);
//			}
//			catch(ArithmeticException ae) {
//				System.err.println("Exception inside Nested Try");
//			}
		}
		catch (ArithmeticException ae) {
			System.err.println("Exception > divide by zero");
			// Try-catch inside catch 
			try { }
			catch(ArithmeticException cte) { }
		}
//		catch (Exception ae) {
//			System.err.println("Exception");
//		}
//		System.out.println("lllll");   // this is wrong
		finally {
			System.out.println("Finally Executed");
			
			//this will work too wut
			try {}
			catch(ArithmeticException o) {}
			finally {}
		}

	}

}
