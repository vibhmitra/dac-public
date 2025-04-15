package com.cdac.CircularLinkedList;

public class CircularLinkedList {
	public Node head;
	public Node tail;
	public int size;

	public Node createCLL(int nodeValue) {
		head = new Node();
		Node newNode = new Node();

		newNode.value = nodeValue;
		newNode.next = newNode;
		head = newNode;
		tail = newNode;
		size = 1;

		return (head);
	}

	// insert mew mode
	public void insertNewNode(int location, int nodeValue) {
		Node newNode = new Node();

		newNode.value = nodeValue;
		if (head == null) {
			createCLL(nodeValue);
		} else if (location == 0) {
			newNode.next = head;
			head = newNode;
			tail.next = head;
		} else if (location >= size) {
			newNode.next = head;
			tail = newNode;
			tail.next = head;
		} else {
			Node tempNode = head;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.next;
				index++;
			}
			Node nextNode = tempNode.next;
			tempNode.next = newNode;
			newNode.next = nextNode;
		}
		size++;
	}

	// print linked list
	public void printCircularList() {
		if (head == null) {
			System.out.println("Bruh! Circular List Ain't Got Anything.");
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
}
