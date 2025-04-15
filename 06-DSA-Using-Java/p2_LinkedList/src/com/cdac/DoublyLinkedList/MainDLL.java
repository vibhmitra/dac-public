package com.cdac.DoublyLinkedList;

public class MainDLL {

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		
		//dll.createDoublyNode(1);
		//System.out.println(dll.head.value);
		
		dll.insertNodes(0, 6);
		dll.insertNodes(1, 11);
		dll.insertNodes(2, 30);
		dll.insertNodes(4, 10);
		dll.insertNodes(4, 80);
		
		dll.printDoublyLinkedList();
		System.out.println("\n");
		dll.reverseDoublyList();
		
		System.out.println("\n");
		dll.deleteDoublyLinkedList(2);
		dll.printDoublyLinkedList();
	}

}
