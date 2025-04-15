package in.cdac.exceptionhandle;

public class FinallyReturn {
	
	
	@SuppressWarnings("finally")
	void method1() {
		try {
			System.out.println("Try Block Statement");
			System.out.println("Second Try Block Statement");
			System.out.println(20/0);
			//return 20;
		}
		
		catch (NullPointerException ex) {
			System.out.println("Null Pointer Catch");
			System.out.println(10/0);
		}
		
		
		catch (ArithmeticException ex) {
			System.out.println("Arithmetic Exception Catch");
		}
		
		catch (Exception ex) {
			System.out.println("All Exception Catch");
//			System.out.println(10/0);
//			System.out.println("Catch Block Down");
		}
		
		
		
		finally {
			System.out.println("Finally Block");
			//return 30;
		}
		System.out.println("Afte Finallly");
	}

	public static void main(String[] args) {
		FinallyReturn fr = new FinallyReturn();
		fr.method1();
	}

}
