package com.cdac.CircularQueueArray;

public class CircularQueue {
	int arr[];
	int front, rear, size;
	
	public CircularQueue(int size) {
		super();
		arr = new int[size];
		front = rear = -1;
		this.size = size;
		System.out.println("Circular Queue of size " + size + " got Created. 👍");
	}
	
	// isFull()
	public boolean isFull() {
		if (front == rear + 1) {
			return (true);
		} else if (rear == 0 && front + 1 == size){
			return (true);
		}
		return (false);
	}
	
	// isEmpty()
	public boolean isEmpty() {
		if (front == -1) {
			return (true);
		} else {
			return (false);
		}
	}
	
	/****** incomplete ******/
}