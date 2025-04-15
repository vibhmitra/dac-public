package in.cdac.collectionframework;

import java.util.*;

public class ArratListTest {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList <String>();
		
		al.add("A");
		al.add("B");
		al.add("null");
		al.add("C");
		al.add("D");
		al.add("Apple");
		al.add("Mango");
		al.add("Kela");
		al.add("Stawberry");
		System.out.println(al);
		System.out.println(al.size());
		
		// call set() method replace an element
		al.set(7, "Banana");
		System.out.println(al);
		String element = al.get(7);
		System.out.println(element);
		
		al.add(3, "Something");
		System.out.println(al);

		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}
		
		// using iterator interface
		System.out.print("\nUsing Iterator Interface :: > ");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
		// Using for each
		System.out.print("\nUsing For Each :: > ");
		for (String i : al) {
			System.out.print(i + " ");
		}
		
		al.clear();
		
	}

}
