package in.cdac;

public class MyOuterClass {

	public int a = 100;
	int b = 200;
	protected int c = 300;
	private int d = 400;
	static int e = 500;

	public void Outer() {
		System.out.println("Outer() Method of MyOuterClass");
	}

	class MyInnerClass {
		public void DisplayData() {
			System.out.println("Value of a = " + a);
			System.out.println("Value of b = " + b);
			System.out.println("Value of c = " + c);
			System.out.println("Value of d = " + d);
			System.out.println("Value of e = " + e);
			Outer();
		}
	}

	public static void main(String[] args) {
		new MyOuterClass().new MyInnerClass().DisplayData();
		new MyOuterClass().Outer();
//		new MyOuterClass().new MyInnerClass().Outer();
	}

}
