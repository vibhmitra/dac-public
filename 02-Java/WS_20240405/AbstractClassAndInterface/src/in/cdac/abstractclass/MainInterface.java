package in.cdac.abstractclass;

interface MyInterface {
	// Interface variables
	int x = 23;
	int y = 20;
	void msg(); 	// abstract method of interface
	
}

public class MainInterface implements MyInterface {

	int a = x;
	int b = y;

	public void output() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	public static void main(String[] args) {
		MainInterface mi = new MainInterface();
		mi.output();
		mi.msg();
	}
	@Override
	public void msg() {
		System.out.println("Interface meth");
		
	}

}
