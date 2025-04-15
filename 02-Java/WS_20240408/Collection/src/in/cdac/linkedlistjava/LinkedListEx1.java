package in.cdac.linkedlistjava;

import java.util.LinkedList;

public class LinkedListEx1 {

	public static void main(String[] args) {
		LinkedList <String> l1 = new LinkedList<>();
		l1.add("Hello");
		l1.add("Mello");
		l1.add("Jello");
		
		System.out.println("Size of linked list : " + l1.size());
		System.out.println(l1);
		
		System.out.println("Using loop : ");
		for (int i = 0; i < l1.size(); i++) {
			Object o = l1.get(i);			// 
			System.out.print(o + " ");
		}
		
		System.out.println("\n");
		
		l1.removeFirstOccurrence(l1.get(1));
		l1.removeFirstOccurrence("Jello");
		System.out.println(l1);
	}

}
