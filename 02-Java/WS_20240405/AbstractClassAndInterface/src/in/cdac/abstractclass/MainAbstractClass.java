package in.cdac.abstractclass;

abstract class MyAbstractClass {
	int x = 10;
	MyAbstractClass() {
		System.out.println("MyAbstractClass Constructor");
	}
	
	// concrete method
	final void meth1() {						// this method cannot be override
		System.out.println("final method of abstract class");
	}
	
	void meth2() {
		System.out.println("normal method of abstract class");	
	}
	
	static void meth3() {
		System.out.println("static method of abstract class");
	}
	
	// abstract class
	abstract void meth4();
	
}



public class MainAbstractClass extends MyAbstractClass {

	@Override
	void meth4() {
		System.out.println("Abstract implementation of abstaract method of abstract class");
		
	}
	
	void display() {
		System.out.println("display method of child class");
	}
	
	public static void main(String[] args) {
//		MainAbstractClass mac = new MainAbstractClass();
//		mac.display();
//		mac.meth1();
//		mac.meth2();
//		meth3();
//		mac.meth4();
//		
		MyAbstractClass abs = new MainAbstractClass();
//		abs.display();	// NOT ALLOWED TO ACCESS CHILD CLASS METHOD
		abs.meth1();
		abs.meth2();
		meth3();
		abs.meth4();
	
		
		

	}

}
