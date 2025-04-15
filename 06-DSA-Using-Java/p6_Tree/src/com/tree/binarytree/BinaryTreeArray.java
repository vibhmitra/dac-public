package com.tree.binarytree;

public class BinaryTreeArray {

	String[] arr;

	int lastUsedIndex;

	public BinaryTreeArray(int size) {
		arr = new String[size + 1];
		System.out.println("Array for binary tree of size " + size + " is created. :)");
		// t c = O(1)
		// s c = O(n) since we have used array
	}

	public boolean isFull() {
		if (arr.length - 1 == lastUsedIndex) {
			return (true);
		} else {
			return (false);
		}
	}

	public void insertNode(String value) {
		if (isFull()) {
			System.out.println("Dang! The Binary Tree got Full! :(");
		} else {
			arr[lastUsedIndex + 1] = value;
			lastUsedIndex++;
			System.out.println("The value " + value + " is inserted into the tree. :)");
		}
	}

	// In-order traversal
	// Left --> Root --> Right
	public void inOrderTraversal(int index) {
		if (index > lastUsedIndex) {
			return;
		}
		inOrderTraversal(2 * index); // visit left sub-tree
		System.out.print(arr[index] + " ");
		inOrderTraversal((2 * index) + 1); // visit right sub-tree

	}
	
	
	
	// Pre-order traversal
		// Root --> Left --> Right
		public void preOrderTraversal(int index) {
			if (index > lastUsedIndex) {
				return;
			}
			System.out.print(arr[index] + " ");
			preOrderTraversal(2 * index); // visit left sub-tree
			preOrderTraversal((2 * index) + 1); // visit right sub-tree

		}
		
	// Post-order traversal
		//Left --> Right --> Root
		public void postOrderTraversal(int index) {
			if (index > lastUsedIndex) {
				return;
			}
			postOrderTraversal(2 * index); // visit left sub-tree
			postOrderTraversal((2 * index) + 1); // visit right sub-tree
			System.out.print(arr[index] + " ");

		}

	public static void main(String[] args) {
		BinaryTreeArray bt = new BinaryTreeArray(9);

		bt.insertNode("N1");
		bt.insertNode("N2");
		bt.insertNode("N3");
		bt.insertNode("N4");
		bt.insertNode("N5");
		bt.insertNode("N6");
		bt.insertNode("N7");
		bt.insertNode("N8");
		bt.insertNode("N9");

		bt.inOrderTraversal(1);	// root node is at the index position 1
		System.out.println();
		bt.preOrderTraversal(1);
		System.out.println();
		bt.postOrderTraversal(1);

	}

}
