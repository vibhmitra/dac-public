package in.cdac.generics;

class SomeClass<T1, T2> {
	T1 t1Obj;	// declare a variable of Type "T1"
	T2 t2Obj;	// declare a variable of Type "T2"
	
	
	SomeClass(T1 t1Obj, T2 t2Obj) {
		this.t1Obj = t1Obj;
		this.t2Obj = t2Obj;
	}
	
	// Instance Method that will return the T type object
	T1 getObj1() {
		return (t1Obj);
	}
	
	T2 getObj2() {
		return (t2Obj);
	}
}


public class GenericManyTypes {

	public static void main(String[] args) {
		SomeClass <Integer, String> oIS = new SomeClass<>(24, "Momo");			// object that 
		System.out.println("Name : " + oIS.getObj2() + "\nAge : " + oIS.getObj1());
		
	}

}
