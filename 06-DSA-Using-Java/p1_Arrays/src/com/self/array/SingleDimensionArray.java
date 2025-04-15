package com.self.array;

import java.util.Arrays;

public class SingleDimensionArray {
	
	public int [] items;
	public int itemCount;
	
	// create array
	public SingleDimensionArray(int size) {
		items = new int [size];
	}
	
	// insertion
	public void insert(int item) {
		// if array is full, resize it
		if (items.length == itemCount) {
			// create a new array twice the size
			int [] newItems = new int[itemCount * 2];
			
			// copy all the existing items
			for (int i = 0; i < itemCount; i++) {
				newItems[i] = items[i];
			}
			
			// set "items" to this new array
			items = newItems;
			System.out.println("Increasing the Size of Items.");
		}
		
		// inserting new items and updating occupied space count
		items[itemCount++] = item;
	}
	
	
	// remove
	public void remove(int index) {
		  try {
		    // Validate index
		    if (index < 0 || index >= itemCount) {
		      throw new IndexOutOfBoundsException("Error: Index " + index + " is out of bounds. List size is " + itemCount);
		    }

		    // Shift items left to fill gap (assuming valid index)
		    for (int i = index; i < itemCount - 1; i++) {
		      items[i] = items[i + 1];
		    }
		    // updating itemCount
		    itemCount--;
		    
		  } catch (IndexOutOfBoundsException e) {
		    // Handle the exception here
		    System.out.println(e.getMessage());
		  }
		}

	// indexOf method
	public int indexOf(int item) {
		for (int index = 0; index < itemCount; index++) {
			if (items[index] == item) {
				return (index);
			}
		}
		return (-1);
	}
	
	
	
	// print array (occupied only)
	public void print() {
			System.out.print("[");
			for (int i = 0; ; i++) {
				System.out.print(items[i]);
				if (i == itemCount - 1) {
					System.out.println("]");
					return;
				}
				System.out.print(", ");
			}
	}
	
	// print array (includes unoccupied)
	public void printAllSpaceInArray() {
		System.out.println(Arrays.toString(items));
	}
}
