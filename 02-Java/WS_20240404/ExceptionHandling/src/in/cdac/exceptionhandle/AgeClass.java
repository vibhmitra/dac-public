package in.cdac.exceptionhandle;

import java.io.*;

//class InvalidAgeException {
//	public static int chkAge(int age) throws Throwable {
//		if (age < 16) {
//			Throwable th = new Throwable("Your Age :(");
//			throw th;
//		}
//		return 0;
//	}
//}

class A {
	public void method() throws IOException {
		System.out.println("Class A Method");
	}
}

class B extends A {
	public void method() {
		System.out.println("Class B Method");
	}
}


public class AgeClass {
	
	
	public static void main(String[] args) {
		A b = new B();
		try {
			b.method();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
