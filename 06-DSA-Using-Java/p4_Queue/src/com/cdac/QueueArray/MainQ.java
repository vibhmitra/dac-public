package com.cdac.QueueArray;

public class MainQ {

	public static void main(String[] args) {
		QueueArray queue = new QueueArray(3);

		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		
		queue.printQueue();
		
		queue.deQueue();
		
		queue.printQueue();
		
		queue.deleteQueue();
	}

}
