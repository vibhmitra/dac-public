package in.cdac.inheritance;

class A {
	// Instance Block
	{
		//System.out.println("Instance Block of A");
		showMeth();
	}
	
	A() {
		System.out.println("Default Contructor of Class A");
		showMeth();
	}
	
	public void showMeth() {
		System.out.println("showMethod() of Class A");
	}
	
	public void showA() {
		System.out.println("showA() of Class A");
	}
	
} // class A ends

class B extends A {
	B() {
		System.out.println("Default Constructor of Class B");
	}
	
	public void showMeth() {
		System.out.println("showMethod() of Class B");
	}
	
	public void showB() {
		System.out.println("showB() of Class B");
	}
}	// class B ends

public class MainClass {

	public static void main(String[] args) {
		
		// Creating Instance of Child Class B
		B b = new B();
		b.showMeth();
		
		System.out.println("\n***\n");
		A a = new B();
		a.showA();
//		a.showB(); 	this will not work as we have passed reference of B class to the object of class A;
		
	}

}
