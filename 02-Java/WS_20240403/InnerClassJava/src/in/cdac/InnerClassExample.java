package in.cdac;

public class InnerClassExample {
	
	class B {
		public void method1() {
			System.out.println("Inner Class Method!");
		}
	}

	public static void main(String[] args) {
		System.out.println("Main Method of Outer Class");
		
		InnerClassExample innerclassexample = new InnerClassExample();
		InnerClassExample.B b = innerclassexample.new B();
		b.method1();
	}
}
