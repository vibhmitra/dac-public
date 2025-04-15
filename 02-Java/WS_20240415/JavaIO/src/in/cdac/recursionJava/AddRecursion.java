package in.cdac.recursionJava;

public class AddRecursion {

	public static void main(String[] args) {
		int x = 12345;
		
		int s = sum(x);
		System.out.println(s);

		int fsum = fib(10);
		System.out.println(fsum);
		
	}
	
	
	public static int sum(int x) {
		if(x<10)
			return x;
		else
			return (x%10)+(sum(x/10));
		
	}

	public static int fib(int x) {
		x = 0;
		int s = 0;
		if (s <= x) {
			x++;
			s = fib(x);
			return s;
		}
		return 0;
		
	}
	
	
	
	
	
	
//	public static int fib() {
//		int i = 1;
//		while(i<10) {
//			System.out.println(i+fib());
//			i++;
//		}
//		return fib();
//	}
		
//	public static void print(int x) {
//		
//		while (x) {
//			
//		}
//		
//	}
	
//	public static void printit(int x) {
//	while (x!=0) {
//		x = x / 10;
//		printit(x);
//		System.out.println(x);
//	}
}

