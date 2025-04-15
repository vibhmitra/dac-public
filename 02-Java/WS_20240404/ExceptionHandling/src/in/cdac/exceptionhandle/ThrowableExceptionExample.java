package in.cdac.exceptionhandle;

public class ThrowableExceptionExample {
	
	public static int divide(int x, int y) throws Throwable {
		if (y == 0) {
			Throwable th = new Throwable("Devide by Zero, Not Possible :(");
			throw th;
		}
		return (x/y);
	}

	public static void main(String[] args) {
		try {
			int result = divide(2,2);
			System.out.println("Result : " + result);
		}
		catch (Throwable t) {
			System.out.println(t.getMessage());
		}

	}

}
