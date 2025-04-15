package in.cdac.abstractclass;

interface OuterInterface {
	// Interface variables
	int x = 23;
	int y = 20;
	void outerMehtod(); 	// abstract method of interface
	
	interface InnerInterface {
		void InnerMethod();
		int x = 9;
	}
}

public class MainNestedInterface implements OuterInterface, OuterInterface.InnerInterface {

	int a = OuterInterface.x;
	int b = y;
	int c = InnerInterface.x;

	public void output() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
	public static void main(String[] args) {
		MainNestedInterface mi = new MainNestedInterface();
		mi.output();
		mi.outerMehtod();
		mi.InnerMethod();
	}
	@Override
	public void outerMehtod() {
		System.out.println("outer Interface meth");
		
	}
	@Override
	public void InnerMethod() {
		System.out.println("inner Interface method");
		
	}

}