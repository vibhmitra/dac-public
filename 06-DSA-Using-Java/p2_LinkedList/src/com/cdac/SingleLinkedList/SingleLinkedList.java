package com.cdac.SingleLinkedList;

public class SingleLinkedList {
	public Node head;
	public Node tail;
	public int size;

	public Node createNode(int nodeValue) {
		head = new Node(); // engine
		Node newNode = new Node(); // car | node created

		newNode.value = nodeValue;
		newNode.next = null;

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
			createNode(nodeValue);
		} else {
			if (location == 0) {
				newNode.next = head;
				head = newNode;
			} else if (location >= size) {
				newNode.next = null;
				tail.next = newNode;
				tail = newNode;
			} else {
				Node tempNode = head;
				int index = 1;
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
	}

	// print linked list
	public void printLinkedList() {
		System.out.print('\n');
		if (head == null) {
			System.out.println("Bruh! Linked List Ain't Got Anything.");
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

	// searching the node
	public boolean searchNode(int nodeValue) {
		System.out.print("\nSearching for " + nodeValue + " in Linked List");
		if (head != null) {
			Node tempNode = head;
			for (int i = 0; i < size; i++) {
				if (tempNode.value == nodeValue) {
					System.out.print("\n" + nodeValue + " Found at Index: " + i);
					return (true);
				}
				tempNode = tempNode.next;
			}
		}
		System.out.print('\n' + nodeValue + " Not Found! in Single Linked List\n");
		return (false);
	}

	// delete node
	public void deleteNodeByIndex(int location) {
		if (head == null) {
			System.out.println("Nothing to Delete Mate!");
			return;
		} else if (location == 0) {
			head = head.next;
			size--;
			if (size == 0) {
				tail = null;
			}
		} else if (location >= size) {
			Node tempNode = head;
			System.out.print("\nThe Index you gave is Exceeded!");
			for (int i = 0; i < size - 1; i++) {
				tempNode = tempNode.next;
			}
			if (tempNode == head) {
				tail = head = null;
				size--;
				return;
			}
			tempNode.next = null;
			tail = tempNode;
			size--;
		} else {
			Node tempNode = head;
			for (int i = 0; i < location - 1; i++) {
				tempNode = tempNode.next;
			}
			tempNode.next = tempNode.next.next;
			size--;
		}
	}

	// delete entire linked list
	public void deleteAllNode() {
		head = tail = null;
		System.out.println("\nWhole Linked List Got Nuked!!!");
		return;
	}

	/*
	 * reverse linked list public void reverseLinkedList() { if (head == null) {
	 * System.out.println("Nothing to Reverse!"); } else { Node prevNode = null;
	 * Node currentNode = currentNode.next; Node
	 * 
	 * for (int i = 0; i < size; i++) { System.out.print(tempNode.value); if (i !=
	 * size - 1) { System.out.print(" -> "); } tempNode = tempNode.next; } } }
	 * 
	 * // total nodes
	 * 
	 * 
	 */

}
