package com.cdac.stackarray;

public class MainStack {
	public static void main(String[] args) {
		StackA stack = new StackA(5);
		
		System.out.println("isEmpty = "+ stack.isEmpty());
		
		// pushing IN
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("isEmpty = " + stack.isEmpty());
		stack.printStack();
		
		// popping OUT
		stack.pop();
		stack.printStack();
		
		stack.pop();
		stack.pop();
		stack.pop();
	}
}
