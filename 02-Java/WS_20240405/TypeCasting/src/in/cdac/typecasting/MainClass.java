package in.cdac.typecasting;

class A {
	public void aMeth() {
		System.out.println("A");
	}
}

class B extends A {
	public void bMeth() {
		System.out.println("B");
	}
}

public class MainClass {

	public static void main(String[] args) {
		B b = new B();
		A a = new B();	// upcast okay
		B ab = (B) a; // this was not okay so we explicitly downcast object of A a as (B)
		
		ab.aMeth();
		ab.bMeth();

	}

}
