package com.hashing.openaddressing;

import java.util.ArrayList;

public class QuadraticProbing {
	String[] hashTable;
	int usedCellNum;

	public QuadraticProbing(int size) {
		hashTable = new String[size];
		usedCellNum = 0;
	}

	// Hash function
	public int modASCIIHashFunction(String word, int hashTableLength) {
		char[] ch = word.toCharArray();
		int sum = 0;
		for (char c : ch) {
			sum += c;
		}
		return sum % hashTableLength;
	}

	// Calculate load factor
	public double getLoadFactor() {
		return (double) usedCellNum / hashTable.length;
	}

	// Rehashing
	public void rehashKeys(String word) {
		usedCellNum = 0;
		ArrayList<String> data = new ArrayList<>();
		for (String str : hashTable) {
			if (str != null) {
				data.add(str);
			}
		}
		data.add(word);
		hashTable = new String[hashTable.length * 2];
		for (String str : data) {
			insertDataInHashTable(str);
		}
	}

	// Insert method using quadratic probing
	public void insertDataInHashTable(String word) {
		double loadFactor = getLoadFactor();
		if (loadFactor >= 0.75) {
			rehashKeys(word);
		} else {
			int hashKeyIndex = modASCIIHashFunction(word, hashTable.length);
			for (int i = 0; i < hashTable.length; i++) {
				int newHashKeyIndex = (hashKeyIndex + i * i) % hashTable.length; // this is the one!
				if (hashTable[newHashKeyIndex] == null) {
					hashTable[newHashKeyIndex] = word;
					System.out.println(word + " inserted into the hash table at position " + newHashKeyIndex);
					usedCellNum++;
					return;
				} else {
					System.out.println(newHashKeyIndex + " is already occupied. Trying next position.");
				}
			}
			System.out.println("HashTable is full. Unable to insert the word.");
		}
	}

	// Display hash table
	public void displayHashTable() {
		if (hashTable == null) {
			System.out.println("HashTable does not exist.");
		} else {
			System.out.println("---------- HashTable ----------");
			for (int i = 0; i < hashTable.length; i++) {
				System.out.println("Index " + i + ": " + hashTable[i]);
			}
		}
	}

	// Search method using quadratic probing
	public boolean searchValue(String word) {
		int hashKeyIndex = modASCIIHashFunction(word, hashTable.length);
		for (int i = 0; i < hashTable.length; i++) {
			int newHashKeyIndex = (hashKeyIndex + i * i) % hashTable.length;
			if (hashTable[newHashKeyIndex] != null && hashTable[newHashKeyIndex].equals(word)) {
				System.out.println(word + " found at location " + newHashKeyIndex);
				return true;
			}
		}
		System.out.println(word + " not found in the hash table");
		return false;
	}

	// Method to delete a key from the hash table using quadratic probing
	public void delete(String word) {
		int hashKeyIndex = modASCIIHashFunction(word, hashTable.length);
		for (int i = 0; i < hashTable.length; i++) {
			int newHashKeyIndex = (hashKeyIndex + i * i) % hashTable.length;
			if (hashTable[newHashKeyIndex] != null && hashTable[newHashKeyIndex].equals(word)) {
				hashTable[newHashKeyIndex] = null;
				usedCellNum--;
				System.out.println(word + " has been deleted from position " + newHashKeyIndex);
				return;
			}
		}
		System.out.println(word + " not found in the hash table");
	}

	public static void main(String[] args) {
		QuadraticProbing qp = new QuadraticProbing(2);
		
		qp.insertDataInHashTable("Delhi");
		qp.insertDataInHashTable("is");
		qp.insertDataInHashTable("the");
		qp.insertDataInHashTable("capital");
		qp.insertDataInHashTable("of");
		qp.insertDataInHashTable("India");
		qp.displayHashTable();

		qp.searchValue("the");
		qp.searchValue("capital");

		qp.delete("Delhi");
		qp.displayHashTable();
	}
	
}