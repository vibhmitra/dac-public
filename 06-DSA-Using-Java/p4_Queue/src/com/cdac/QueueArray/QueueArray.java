package com.cdac.QueueArray;

public class QueueArray {
	public int[] arr;
	public int front;
	public int rear;
	public QueueArray(int size) {
		super();
		this.arr = new int [size];
		this.front = -1;
		this.rear = -1;
		System.out.println("Queue of size "  + size + " got created. :)");
	}
	
	// isEmpty()
	public boolean isEmpty() {
		if (front == -1) {
			return (true);
		} else {
			return (false);
		}
	}
	
	// isFull()
	public boolean isFull() {
		if (rear == (arr.length - 1)) {
			return (true);
		} else {
			return (false);
		}
	}
	
	// enQueue()
	public void enQueue(int value) {
		if (isFull()) {
			System.out.println("Insertion Failed! Reason: Queue got Full. :(");
		} else if (isEmpty()) {
			front = 0;
			rear++;
			arr[rear] = value;
			System.out.println(value + " got inserted into the Queue. :)");
		} else {
			rear++;
			arr[rear] = value;
			System.out.println(value + " got inserted into the Queue. :)");
		}
	}
	
	// deQueue()
	public int deQueue() {
		if (isEmpty()) {
			System.out.println("Failed to Dequeue. Reaseon: Queue is Empty :(");
			return (1);
		} else {
			int frontValue = arr[front];
			front++;
			if (front > rear) {
				front = rear = -1;
			}
			System.out.println("\n" + frontValue + " got dequeued. :)");
			return (0);
		}
	}
	
	// deleteQueue() 
	public void deleteQueue() {
		arr = null;
		front = rear = -1;
		System.out.println("\nQueue Got Wiped Out. :>");
	}
	
	// print
	public void printQueue() {
		for (int i = front; i <= rear; i++) {
			if (i == front) {
				System.out.print("F > " + arr[i] + " ");
			} else if (i == rear) {
				System.out.print(arr[i] + " < R");
			} else {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
