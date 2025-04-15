package in.cdac.collectionframework;

import java.util.*;

public class GenericList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();		// Left side diamond syntax <>
		list.add("pen");
		list.add("pencil");
		list.add("notebook");
		list.add("pumpkin");
		list.add("poop");
		list.add("pumpkin");
		// list.add(1)
		System.out.println("List of All elements : > " + list);
		
		System.out.println("Index of " + list.get(3) + " : " + list.indexOf("pumpkin"));
		
		System.out.println(list.get(4));

	}

}
