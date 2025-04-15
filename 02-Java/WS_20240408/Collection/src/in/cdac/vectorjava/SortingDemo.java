package in.cdac.vectorjava;

import java.util.Collections;
import java.util.Vector;

public class SortingDemo {
	
	static void display(Vector<Integer> vecStream) {
		for(Integer vecElement: vecStream) {
			System.out.print(vecElement + " ");
		}
	}

	public static void main(String[] args) {
		Vector <Integer> v = new Vector <Integer>();
		v.add(3);
		v.add(7);
		v.add(1);
		v.add(2);
		v.add(9);
		v.add(4);
		
		System.out.print("\nVECTOR ELEMENTS >\t");
		display(v);
		
		System.out.print("\nASCENDING ORDER >\t");
		Collections.sort(v);
		display(v);
		
		System.out.print("\nDESCENDING ORDER >\t");
		Collections.reverse(v);
		display(v);
		
		System.out.print("\nSHUFFLE >\t\t");
		Collections.shuffle(v);
		display(v);
	}

}
