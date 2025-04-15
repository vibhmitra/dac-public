package com.cdac.stackarray;

public class StackA {
	int[] arr;
	int topOfStack;
	
	public StackA(int size) {
		super();
		this.arr = new int[size];
		this.topOfStack = -1;
		System.out.println("Stack of size : " + size + " Got Created");
	}
	
	public boolean isFull() {
		if (topOfStack == arr.length - 1) {
			return (true);
		}
		else {
			return (false);
		}
	}
	
	public boolean isEmpty() {
		if (topOfStack == - 1) {
			return (true);
		}
		else {
			return (false);
		}
	}
	
	public void push(int value) {
		if(isFull()) {
			System.out.println("Stack is Full! :(");
		}
		else {
			arr[topOfStack + 1] = value;
			topOfStack++;
			System.out.println(value + " got Inserted. :)");
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("\nNothing to Pop! Stack is Empty :(");
			return (-1);
		}
		else {
			int topValue = arr[topOfStack];
			topOfStack--;
			System.out.print("\nPopped " + topValue + " Out of Stack! :)");
			return (topValue);
		}
	}
	
	public int peek() {
		if (isEmpty() || arr == null) {
			System.out.println("Stack is Empty. :>");
			return (-1);
		}
		else {
			return (arr[topOfStack]);
		}
	}
	
	public void printStack() {
		System.out.print('\n');
		for (int i = 0; i <= topOfStack; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
}
