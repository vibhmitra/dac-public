package com.cdac.stacklinkedlist;

public class Main {
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		stack.peek();
		stack.pop();
		stack.peek();
		
		
		stack.deleteStack();
		
	}
}
