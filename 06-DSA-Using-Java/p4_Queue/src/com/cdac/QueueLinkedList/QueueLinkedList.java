package com.cdac.QueueLinkedList;

public class QueueLinkedList {
	SingleLinkedList linkedList;
	
	public QueueLinkedList() {
		linkedList = new SingleLinkedList();
		System.out.println("The Queue got Created. :)");
	}
	
	// isEmpty() 
	public boolean isEmpty() {
		if (linkedList.head == null) {
			return (true);
		} else {
			return (false);
		}
	}
	
	// enqueueLL()
	public void enqueueLL(int value) {
		linkedList.insertNewNode(linkedList.size+1, value);
		System.out.println(value + " got inserted into the Queue. :)");
	}
	
	// dequeueQLL()
	public int dequeueLL() {
		int frontValue = -1;
		if (isEmpty()) {
			System.out.println("Failed to Dequeue. Reaseon: Queue is Empty :(");
			return (1);
		} else {
			frontValue = linkedList.head.value;
			linkedList.deleteNodeByIndex(0);
			System.out.println(frontValue + " got dequeued. :)");
			return (frontValue);
		}
	}
	
	
	// peekQLL()
	public int peekQLL() {
		if(isEmpty()) {
			System.out.println("Nothing to Peek at. Reason: Queue is Empty :(");
			return (1);
		} else {
			
			System.out.println(linkedList.head.value + " Peekaboo :)");
			return (linkedList.head.value);
		}
	}
	
	// delete() 
	public void deleteQueue() {
		linkedList.head = null;
		linkedList.tail = null;
		System.out.println("The Queue Got Deleted");
	}
}
