package in.cdac.generics;

class MyClass<T> {
	T typeObj;	// declare a variable of Type "T"
	
	MyClass(T typeObj) {
		this.typeObj = typeObj;
	}
	
	// Instance Method that will return the T type object
	T getValue() {
		return (typeObj);
	}
}


public class GenericClassTest {

	public static void main(String[] args) {
		MyClass <Integer> oI = new MyClass<>(0);
		System.out.println(oI.getValue());
		
		MyClass <String> oS = new MyClass<>(":)");
		System.out.println(oS.getValue());
		
		MyClass <Double> oF = new MyClass<>(8.85);
		System.out.println(oF.getValue());
	}

}
