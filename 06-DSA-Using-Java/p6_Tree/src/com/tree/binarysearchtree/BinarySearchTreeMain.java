package com.tree.binarysearchtree;

import java.util.LinkedList;
import java.util.Queue;

class BinarySearchTree {

	// A Node Class
	class BinaryNode {
		public int value;
		public int height;
		public BinaryNode right, left;
	}

	BinaryNode root;

	public BinarySearchTree() {
		root = null;
	}

	// insert method()
	// time complexity & space complexity: O(logN)
	public BinaryNode insertNode(BinaryNode currentNode, int value) {
		if (currentNode == null) {
			BinaryNode newNode = new BinaryNode();
			newNode.value = value;
			System.out.println("The [" + value + "] got inserted in the tree. 👍");
			return (newNode);
		} else if (value <= currentNode.value) {
			currentNode.left = insertNode(currentNode.left, value);
			return (currentNode);
		} else {
			currentNode.right = insertNode(currentNode.right, value);
			return (currentNode);
		}
	}

	public void insert(int value) {
		root = insertNode(root, value);
	}

	// in-order traversal (Left --> Root --> Right)
	public void inOrder(BinaryNode node) {
		if (node == null) {
			return;
		} else {
			inOrder(node.left);
			System.out.print(node.value + " ");
			inOrder(node.right);
		}
	}

	// pre-order traversal (Root --> Left --> Right)
	public void preOrder(BinaryNode node) {
		if (node == null) {
			return;
		} else {
			System.out.print(node.value + " ");
			preOrder(node.left);
			preOrder(node.right);
		}
	}

	// pre-order traversal (Root --> Left --> Right)
	public void postOrder(BinaryNode node) {
		if (node == null) {
			return;
		} else {
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.value + " ");
		}
	}

	// levelOrder
	public void levelOrder() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			System.out.print(presentNode.value + " ");
			if (presentNode.left != null) {
				queue.add(presentNode.left);
			}
			if (presentNode.right != null) {
				queue.add(presentNode.right);
			}
		}
	}

	// min
	public BinaryNode min(BinaryNode root) {
		if (root == null)
			return (null);
		while (root.left != null) {
			root = root.left;
		}
		return root;
	}

	// max
	public BinaryNode max(BinaryNode root) {
		if (root == null)
			return (null);
		while (root.right != null) {
			root = root.right;
		}
		return root;
	}

	// delete node from a tree
	public BinaryNode deleteNode(BinaryNode root, int value) {
		if (root == null) {
			System.out.println("value not found");
			return root;
		}
		// traverse tree
		if (value < root.value) {
			root.left = deleteNode(root.left, value);
		} else if (value > root.value) {
			root.right = deleteNode(root.right, value);
		} else {
			// node with one or no child
			if (root.left == null) 
				return (root.right);
			else if (root.right == null)
				return (root.left);
			
			// Node with two children: Get the inorder successor
			root.value = min(root.right).value;
			
			root.right = deleteNode(root.right, root.value);
		}
		return root;
	}

} // EOC : BinarySearchTree //////////////////////////////

public class BinarySearchTreeMain {
	// Driver
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(52);
		bst.insert(36);
		bst.insert(68);
		bst.insert(24);
		bst.insert(59);
		bst.insert(72);
		bst.insert(70);
		bst.insert(80);

		// inOrder(node) call
		System.out.print("InOrder Traversal > ");
		bst.inOrder(bst.root);

		System.out.println();

		// preOrder(node) call
		System.out.print("preOrder Traversal > ");
		bst.preOrder(bst.root);

		System.out.println();

		// ppostOrder(node) call
		System.out.print("postOrder Traversal > ");
		bst.postOrder(bst.root);

		System.out.println();

		// levelOrder(node) call
		System.out.print("levelOrder Traversal > ");
		bst.levelOrder();

		// min
		System.out.print("\nMIN: " + bst.min(bst.root).value);

		// max
		System.out.print("\nMAX: " + bst.max(bst.root).value);

		// delete
		System.out.print("\nAfter Deleting 72 form BST: ");
		bst.preOrder(bst.deleteNode(bst.root, 72));
		

	}
}
