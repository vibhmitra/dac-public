package com.cdac.DoublyLinkedList;

public class DoublyLinkedList {
	public Node head;
	public Node tail;
	public int size;
	Node newNode;
	
	
	public Node createDoublyNode(int nodeValue) {
		head = new Node();
		Node newNode = new Node();
		
		newNode.value = nodeValue;
		newNode.next = null;
		newNode.prev = null;
		head = newNode;
		tail = newNode;
		
		size = 1;
		return (head);
	}
	
	// insert new nodes
	public void insertNodes(int location, int nodeValue) {
		newNode = new Node();
		newNode.value = nodeValue;
		
		if (head == null) {
			createDoublyNode(nodeValue);
		} else 
			{
				if (location == 0) {

					newNode.next = head;
					newNode.prev = null;
					head = newNode;
				} else if (location >= size) {
					newNode.next = null;
					tail.next = newNode;
					newNode.prev = tail;
					tail = newNode;
				} else {
					Node tempNode = head;
					int index = 0;
					while (index < location - 1) {
						tempNode = tempNode.next;
						index++;
					}
					newNode.prev = tempNode;
					newNode.next = tempNode.next;
					tempNode.next = newNode;

				}
		size++;
		}
	}
	
	
	// print linked list
		public void printDoublyLinkedList() {
			if (head == null) {
				System.out.println("Bruh! Doubly List Ain't Got Anything.");
			} else {
				Node tempNode = head;
				for (int i = 0; i < size; i++) {
					System.out.print(tempNode.value);
					if (i != size - 1) {
						System.out.print(" -> ");
					}
					tempNode = tempNode.next;
				}
			}
		}
		
	// reverse list
		public void reverseDoublyList() {
			if (head == null) {
				System.out.println("Nothing to Reverse");
			}
			else {
				Node tempNode = tail;
				for (int i = 0; i < size; i++) {
					System.out.print(tempNode.value);
					if (i != size - 1) {
						System.out.print(" -> ");
					}
					tempNode = tempNode.prev;
				}
			}
			
		}
		
	// delete list
		public void deleteDoublyLinkedList(int location) {
			if (head == null) {
				System.out.println("Nothing to Delete!");
			}
			else if (location == 0) {
				if (size == 1) {
					head = tail = null;
					size--;
					return;
				}
				else {
					head = head.next;
					head.prev = null;
					size--;
				}
			} else if (location >= size) {
				Node tempNode = tail.prev;
				if (size == 1) {
					head = tail = null;
					size--;
					return;
				} else {
					tempNode.next = null;
					tail = tempNode;
					size--;
				}
			}
			else {
				Node tempNode = head;
				for (int i = 0; i < location - 1; i++) {
					tempNode = tempNode.next;
				}
				tempNode.next = tempNode.next.next;
				tempNode.next.prev = tempNode;
				size--;
			}
		}
		
} // class will end here hopefully!!!
