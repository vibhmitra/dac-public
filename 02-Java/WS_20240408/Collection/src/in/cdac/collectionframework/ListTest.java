package in.cdac.collectionframework;

import java.util.*;

public class ListTest {

	public static void main(String[] args) {
		List a1= new ArrayList();
		a1.add(10);
		a1.add(10);
		a1.add(40);
		a1.add(20);
		a1.add("Hello");
		a1.add(null);
		
		System.out.println(a1);
		
		a1.add(2 , "Mello");
		System.out.println(a1);
		
		List a2 = new ArrayList();
		
		a2.add(100);
		a2.add(200);
		a2.addAll(a1);
		System.out.println(a2);
		
	}

}
