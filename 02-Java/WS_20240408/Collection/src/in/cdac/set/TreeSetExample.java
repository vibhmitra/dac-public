package in.cdac.set;

import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> s = new TreeSet<String>();	// <> diamond syntax
		
		
		s.add("A");
		s.add("C");
		s.add("Z");
		s.add("N");
		s.add("P");	
		s.add("B");	
		s.add("D");
		
		System.out.println("Sorted Data >> " + s);
		System.out.println("First Data >> " + s.first());
		System.out.println("Last Data >> " + s.last());
		System.out.println("Data Lower than 'N' >> " + s.lower("N"));	
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(100);
		ts.add(700);
		ts.add(20);
		ts.add(200);
		ts.add(300);
		ts.add(400);
		
		System.out.println("Sorted Data >> " + ts);
		System.out.println("hedSet >> " + ts.headSet(100, false));
		System.out.println("subSet >> " + ts.subSet(200, false, 700, true));
	}

}
