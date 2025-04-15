package com.cdac.QueueLinkedList;

public class MainQLL {

	public static void main(String[] args) {
		QueueLinkedList qll = new QueueLinkedList();
		
		qll.enqueueLL(10);
		qll.enqueueLL(20);
		qll.enqueueLL(30);
		qll.enqueueLL(40);
		qll.enqueueLL(50);
		
		qll.dequeueLL();
		qll.dequeueLL();
		qll.dequeueLL();
		qll.dequeueLL();
		qll.dequeueLL();
		qll.dequeueLL();
		
		qll.peekQLL();
		
		qll.deleteQueue();

	}

}
