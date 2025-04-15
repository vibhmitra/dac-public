package com.cdac.SingleLinkedList;

public class MainLinkedList {

	public static void main(String[] args) {
		SingleLinkedList sll = new SingleLinkedList();
		
		/*
		 * sll.createNode(6);
		 * 
		 * System.out.println(sll.head.value); System.out.println(sll.tail.value);
		 */

		//sll.createNode(6);
		sll.insertNewNode(0, 2);
		sll.insertNewNode(1, 8);
		sll.insertNewNode(2, 9);
		sll.insertNewNode(2, 6);
		sll.insertNewNode(3, 7);
		
		sll.printLinkedList();
		
		sll.searchNode(8);
		sll.searchNode(6);
		
		sll.deleteNodeByIndex(3);
		
		sll.printLinkedList();
		
		//sll.deleteAllNode();
		
		//sll.reverseLinkedList();
	}

}
