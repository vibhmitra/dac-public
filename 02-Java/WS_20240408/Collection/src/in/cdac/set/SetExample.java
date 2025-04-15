package in.cdac.set;

import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		Set<String> s = new HashSet<>();	// <> diamond syntax
		
		System.out.println("IS SET EMPTY? > " + s.isEmpty());
		System.out.println("SET SIZE > " + s.size());
		
		s.add("Applo");
		s.add("Oraango");
		s.add("Banano");
		s.add("Applo");	// duplicate will be overridden
		s.add(null);
		s.add("Peacho");
		
		System.out.println(s);
		s.remove(null);
		if (!s.equals("Cherryo")) { 
			System.err.println("Cherryo is not presesnt\nAdding Cherryo...");
			s.add("Cherryo");
		}
		System.out.println(s);

	}

}
