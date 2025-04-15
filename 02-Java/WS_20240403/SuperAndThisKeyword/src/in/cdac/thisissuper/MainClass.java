package in.cdac.thisissuper;

class MyClass {
	MainClass obj; // reference variable

	MyClass(MainClass obj) {
		this.obj = obj;
	}

	public void show() {
		System.out.println("Show method of MyClass");
		System.out.println("Value of x in : " + obj.x);
	}
}

public class MainClass {
	int x = 30;

	MainClass() {
//		Calling constructor of MyClass using "this" keyword. | 'this' keyword will pass the reference of current class object of MyClass.
		MyClass obj2 = new MyClass(this);
		obj2.show();

	}

	public static void main(String[] args) {
		MainClass obj3 = new MainClass();
		System.out.println(obj3);

	}
}
