package com.self.dynamicarray;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/**
		* Java has two types of Dynamic array
		* 1. Vector : 100% increase when its full
		* 2. ArrayList: 50% increase when full
		* 
		*/
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		
		list.toArray(); // this will convert to regular array.
		System.out.println(list);
	}

}
