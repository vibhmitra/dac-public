package in.cdac.string;

class A {
	A() {
		System.out.println("Contructor of A");
	}

	@Override
	public String toString() {
		return "toString A";
	}
}

class B extends A {
	B() {
		System.out.println("Contructor of B");
	}

	@Override
	public String toString() {
		return "toString B";
	}
}

class C extends B {
	C() {
		System.out.println("Contructor of C");
	}

	@Override
	public String toString() {
		return "toString C";
	}
}



public class CastingMainClass {

	public static void main(String[] args) {
		A a1 = new C();		// upcast
		System.out.println(a1);
		
		B b1 = (B) a1; // downcast  B b1 = (B) new C();	
		System.out.println(a1);
		
		C c1 = (C) b1;
		System.out.println(c1); // downcast  C c1 = (C) 
		
		A a2 = new B();		// upcast
		System.out.println(a2);
		
		B b2 = (B) a2;	// downcast
		C c2 = (C) a2;	// no compilation error but runtime error
		
	}

}
