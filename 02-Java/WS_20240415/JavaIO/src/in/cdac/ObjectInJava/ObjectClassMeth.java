package in.cdac.ObjectInJava;

class SomeClass {
	int x;

	public SomeClass(int x) {
		super();
		this.x = x;
	}
	
	static void printName(Object obj) {
		// getting class into an Object c of the class
		Class c = obj.getClass();
		
		System.out.println("Name of Class : " + c.getName());
	}
}

public class ObjectClassMeth {

	public static void main(String[] args) {
		SomeClass obj1 = new SomeClass(20);
		SomeClass obj2 = new SomeClass(20);
		
		if (obj1.equals(obj2)) {
			System.out.println("Obj1 = Obj2");
		}
		else 
			System.out.println("Obj1 != Obj2");

		Integer obj3 = new Integer(20);
		Integer obj4 = new Integer(20);
		if (obj1.equals(obj2)) {
			System.out.println("Obj1 = Obj2");
		}
		else 
			System.out.println("Obj1 != Obj2");
		
		SomeClass obj = new SomeClass(100);
		System.out.println(obj);
		
	}

}
