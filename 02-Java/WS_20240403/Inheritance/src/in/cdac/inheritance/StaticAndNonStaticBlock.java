package in.cdac.inheritance;

class MyClass {
	int a = 25;
	// Default constructor
	MyClass() {
		System.out.println("Default Contructor.");
	}
	
	// Static block | This will only executes once
	static {
		System.out.println("Static Block of MyClass");
	}
	
	// Instance block
	{
		System.out.println("Instance Block fo MyClass");
	}
}


public class StaticAndNonStaticBlock extends MyClass {

	public static void main(String[] args) {
		System.out.println("Main Class");
		MyClass obj = new MyClass();
		System.out.println(obj.a);
		
		MyClass obj2 = new MyClass();

	}

}
