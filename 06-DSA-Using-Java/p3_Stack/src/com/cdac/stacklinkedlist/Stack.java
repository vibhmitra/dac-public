package com.cdac.stacklinkedlist;

public class Stack {
	SingleLinkedList linkedList;
	
	public Stack() {
		linkedList = new SingleLinkedList();
	}
	
	// `isEmpty()` meh-thod
	public boolean isEmpty() {
		if (linkedList.head == null) {
			return (true);
		} else {
			return (false);
		}
	}
	
	// `push()` meh-thod
	public void push(int value) {
		linkedList.insertNewNode(0, value);
		System.out.println(value + " got inserted into the stack.");
	}
	
	// `pop()` meh-thod
	public int pop() {
		int topValue = -1;
		if(isEmpty()) {
			System.out.print("\nNothing to Pop!");
			return (-1);
		} else {
			topValue = linkedList.head.value;
			linkedList.deleteNodeByIndex(0);
			System.out.println(topValue + " got Popped outta stack.");
			return (topValue);
		}
	}
	
	// `peek() meh-thod`
	public int peek() {
		int topValue = -1;
		if(isEmpty() || linkedList.head == null) {
			System.out.print("\nNothing to Peek 👁👁!");
			return (-1);
		} else {
			topValue = linkedList.head.value;
			System.out.println(topValue + " is saying --> 'Imma Top of Stack!'");
			return (topValue);
		}
	}
	
	// `delete()` meh-thod
	public void deleteStack() {
		if (linkedList.head == linkedList.tail) {
			System.out.println("What you even Deleting Bruh!");
			return;
		}
		linkedList.head = null;
		System.out.println("Stack Wiped Out! :>");
	}
}
