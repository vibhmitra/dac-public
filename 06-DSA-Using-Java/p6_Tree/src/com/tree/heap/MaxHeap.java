package com.tree.heap;

import java.util.ArrayList;
import java.util.List;

public class MaxHeap {

	public List<Integer> heap;

	public MaxHeap() {
		this.heap = new ArrayList<>();
	}

	public List<Integer> getHeap() {
		return new ArrayList<>(heap);
	}

	public int leftChild(int index) {
		return 2 * index + 1;
	}

	public int rightChild(int index) {
		return 2 * index + 2;
	}

	public int parent(int index) {
		return (index - 1) / 2;
	}

	public void swap(int index1, int index2) {
		int temp = heap.get(index1);
		heap.set(index1, heap.get(index2));
		heap.set(index2, temp);
	}

	public void insert(int value) {
		heap.add(value);
		int current = (heap.size() - 1);

		// maximum
		while (current > 0 && heap.get(current) > heap.get(parent(current))) {
			swap(current, parent(current));
			current = parent(current);
		}
	}

	// TopToBottom
	public void sinkDown(int index) {
		int maxIndex = index;
		while (true) {
			int leftIndex = leftChild(index);
			int rightIndex = rightChild(index);

			if (leftIndex < heap.size() && heap.get(leftIndex) > heap.get(maxIndex)) {
				maxIndex = leftIndex;
			}
			if (rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxIndex)) {
				maxIndex = rightIndex;
			}
			if (maxIndex != index) {
				swap(index, maxIndex);
				index = maxIndex;
			} else {
				return;
			}
		}
	}

	// delete meth
	public Integer remove() {
		if (heap.size() == 0) {
			return (null);
		}
		if (heap.size() == 1) {
			return (heap.remove(0));
		}
		int maxValue = heap.get(0);
		heap.set(0, heap.remove(heap.size() - 1));
		sinkDown(0);

		return (maxValue);
	}
	
	public static void main(String[] args) {
		// Create a new Heap object
	        MaxHeap heap = new MaxHeap();
	
	        // Sample data to insert
	        heap.insert(15);
	        heap.insert(10);
	        heap.insert(20);
	        heap.insert(30);
	        heap.insert(25);
	        heap.insert(8);
	        heap.insert(40);
	        System.out.println("Heap after insertions: " + heap.getHeap());

		// Removing data from MaxHeapTree
	        Integer removedValue = heap.remove();
	        System.out.println("Removed maximum element which was: " + removedValue);
	        System.out.println("Heap after removal: " + heap.getHeap());

		return;
	}
}
