package in.cdac;

public class A {
	String name = "John";

	static class BB {
		public static void main(String[] args) { 
			System.out.println("Main From Static Inner Class. BB");
		}
		
		public void greet() {
			System.out.println("Method Inside Static Class. BB");
		}
	}

	class B {
		private String name = "Mike";

		class C {
			String name = "Kate";

			public void display() {
				System.out.println("Display Method of C");
				System.out.println(A.this.name); // John
				System.out.println(B.this.name); // Mike
				System.out.println(this.name); // Kate
			}

		}
	}

	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		A.B.C c = b.new C();

		c.display();
		// System.out.println(b.name);
		
		BB bb = new BB();
		BB.main(args);
		bb.greet();
	}

}
