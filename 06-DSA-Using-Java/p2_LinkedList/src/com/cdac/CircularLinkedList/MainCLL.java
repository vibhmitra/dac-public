package com.cdac.CircularLinkedList;

public class MainCLL {

	public static void main(String[] args) {
		CircularLinkedList cll = new CircularLinkedList();
		cll.createCLL(1);
		System.out.println(cll.head.value);
		System.out.println(cll.head.next.value);
		
		cll.insertNewNode(0, 4);
		cll.insertNewNode(1, 2);
		cll.insertNewNode(2, 8);
		cll.printCircularList();
		
		System.out.println('\n');
		System.out.println(cll.tail.next.value);

	}

}
