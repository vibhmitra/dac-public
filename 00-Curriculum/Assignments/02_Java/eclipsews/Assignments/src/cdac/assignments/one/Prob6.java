package cdac.assignments.one;

public class Prob6 {
	
	public static void main(String[] args) {
		int a = 4, b = 7;
		
		System.out.println("Before Swap > ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		// swap logic
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After Swap > ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
			
	}

}
