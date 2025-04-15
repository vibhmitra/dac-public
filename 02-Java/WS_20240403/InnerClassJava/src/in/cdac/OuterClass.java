package in.cdac;

public class OuterClass {

	int x = 100;	// Instance Variable of Outer Class
	static int y = 90;  // static variable
	
	public static void dispalyOuter() {
		System.out.println("Value of Outer Y : " + y);
	}
	
	public void outerMethod() { 
		int x = 50;
		final int y = 20;
		
		class InnerClass {
			public void displayData() {
				System.out.println(x);
				System.out.println(y);
				dispalyOuter();
			}
		} // Inner Class Closed
		
		InnerClass ic = new InnerClass();	// instance created for Inner class.
		ic.displayData();
		OuterClass oc = new OuterClass();
		
	}
	
	
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		oc.outerMethod();
		System.out.println(oc.x);
		
	}

}