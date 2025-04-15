package in.cdac.generics;


// a generic interface
interface myInterface2 <T> {
	public void method1(T t);
}

// non-generic class
class NGclass {
	
	// generic method inside non generic class
	public <T> void printArray(T[] myArray) {
		for (T t : myArray) {
			System.out.print(t + " ");
		}
	}
}

// generic interface
public class GenericInterface<T> implements myInterface2 <T>{

	public static void main(String[] args) {
		GenericInterface <Integer> gi = new GenericInterface<>();
		gi.method1(15);
		
		GenericInterface <String> gi2 = new GenericInterface<>();
		gi2.method1("Momo");
		
		
		NGclass ngArr = new NGclass();
		Integer[] myIntArray = {1,3,4,5,5};
		ngArr.printArray(myIntArray);
		
		NGclass ngStr = new NGclass();
		String[] myStringArray = {"\nhelo", "halo", "melo"};
		ngStr.printArray(myStringArray);
	}

	@Override
	public void method1(T t) {
		System.out.println("method1() Called : parameter value > " + t);
		
	}

}
