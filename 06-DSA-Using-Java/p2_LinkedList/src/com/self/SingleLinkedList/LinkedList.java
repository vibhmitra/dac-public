package com.self.SingleLinkedList;

public class LinkedList {
	
	private class Node {
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
	}
	
	Node first;
	Node last;
	
	// addFirst
	// addLast
	public void addLast(int item) {
		var node = new Node(item);
		
		if (first == null) 
			first = last = node;
		else 
		{
			last.next = node;
			last = node;
		}
	}
	// deleteFirst
	// deleteLast
	// contains
	// indexOf
	public void print() {
		System.out.println(first.next);
		print();
	}
}
