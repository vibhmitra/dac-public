package in.cdac.generics;

import java.util.*;

// generic interface
interface MyInterface <T extends Comparable<T>> {
	T max();
	T min();
}

class GenericClass<T extends Comparable <T>> implements MyInterface {
	T[] values;
	GenericClass(T[] values) {
		this.values = values;
	}
	
	
	public T max() {
		T maxElement = values[0];
		for (int i = 0; i < values.length; i++) {
			if (values[i].compareTo(maxElement) > 0)
				maxElement = values[i];
		}
		return maxElement;
		
	}

	public T min() {
		T minElement = values[0];
		for (int i = 0; i < values.length; i++) {
			if (values[i].compareTo(minElement) < 0)
				minElement = values[i];
		}
		return minElement;
	}
}

public class GenericClassMain {

	public static void main(String[] args) {
		Integer[] intArray = {5,6,3,8,4,1,2};
		Character[] charArray = {'a', 'y' , 'u', 'g', 'd'};
		
		GenericClass <Integer> gcI = new GenericClass<>(intArray);
		
		System.out.println("MAX INT > " + gcI.max());
		System.out.println("MIN INT > " + gcI.min());
		
		GenericClass <Character> gcC = new GenericClass<>(charArray);
		
		System.out.println("MAX CHAR > " + gcC.max());
		System.out.println("MIN CHAR > " + gcC.min());
			
	}

}
