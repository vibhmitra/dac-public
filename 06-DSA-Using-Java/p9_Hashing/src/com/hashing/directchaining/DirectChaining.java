/**
 * Direct Chaining / Open Hashing / Separate Chaining
 */

package com.hashing.directchaining;

import java.util.LinkedList;

public class DirectChaining {
	LinkedList<String>[] hashTable;
	int maxChainSize = 10;	
	
	DirectChaining(int size) {
		hashTable = new LinkedList[size];
	}
	
	public int modASCIIHashFunction(String word, int cellNo) {
		char charArray[];
		charArray = word.toCharArray();
		int i, sum;
		for (sum = 0, i = 0; i < word.length(); i++) {
			sum += charArray[i];
		}
		return (sum % cellNo);
	}
	
	public void insertHashTable(String word) {
		int hashKeyIndex = modASCIIHashFunction(word, hashTable.length);
		if (hashTable[hashKeyIndex] == null) {
			hashTable[hashKeyIndex] = new LinkedList<String>();	// if collision, make a new node
			hashTable[hashKeyIndex].add(word);
		} else {
			hashTable[hashKeyIndex].add(word);
		}
	}
	
	public boolean searchWord(String word) {
		int hashKeyIndex = modASCIIHashFunction(word, hashTable.length);
		System.out.println("Searching for '" + word + "' in HashTable... :>");
		if (hashTable[hashKeyIndex] != null && hashTable[hashKeyIndex].contains(word)) {
			System.out.println("'" + word + "' found in Hash Table @index : " + hashKeyIndex + "! :)");
			return (true);
		} else {
			System.out.println("'" + word  + "' not found in Hash Table! :(");
			return (false);
		}
	}
	
	public void printHashTable() {
		if (hashTable == null ) {
			System.out.println("Hash Table Ain't Exist! : (");
		} else {
			System.out.println("Hash Table Does Exist! : ) \nHere is the Data: ");
			for (int i = 0; i < hashTable.length; i++) {
				System.out.println("Index: [" + i + "] , Key: " + hashTable[i] );
			}
		}
	}
	
	public void deleteWord(String word) {
		int hashKeyIndex = modASCIIHashFunction(word, hashTable.length);
		if (searchWord(word)) {
			hashTable[hashKeyIndex].remove(word);
			System.out.println("'" + word + "' has Deleted from Hash Table! :)");
			hashTable[hashKeyIndex] = null;
		} else {
			System.out.println("'" + word + "' is not deleted! :(");
			return;
		}
	}
	
	public static void main(String[] args) {
		DirectChaining dc = new DirectChaining(8);
		dc.insertHashTable("Delhi");
		dc.insertHashTable("is");
		dc.insertHashTable("the");
		dc.insertHashTable("scariest");
		dc.insertHashTable("place");
		dc.insertHashTable("I");
		dc.insertHashTable("ever");
		dc.insertHashTable("been");
		
		dc.printHashTable();
		
		dc.searchWord("place");
		dc.searchWord("Good");
		
		dc.deleteWord("is");
		dc.printHashTable();
	}
}
