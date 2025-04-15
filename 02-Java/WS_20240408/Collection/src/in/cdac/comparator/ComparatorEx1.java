package in.cdac.comparator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

class Ascending implements Comparator <Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
		return i1.compareTo(i2);
	
	}
}

class Descending implements Comparator <Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
		return i2.compareTo(i1);
	
	}
	
}

public class ComparatorEx1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader duffer = new BufferedReader(isr);
		System.out.println("How Many?");
		int size = Integer.parseInt(duffer.readLine());

		Integer arr[] = new Integer[size];
		
		// input
		System.out.println("Enter Elements: > ");
		for (int i = 0; i < size; i++) {
			
			arr[i] = Integer.parseInt(duffer.readLine());
		}
		
		// sorting
		Ascending as = new Ascending();
		Arrays.sort(arr, as);
		display(arr);
		
		System.out.println("\n");
		
		Descending ds = new Descending();
		Arrays.sort(arr, ds);
		display(arr);
	}
	
	public static void display(Integer[] arrStream) {
		System.out.print("Updated Array :");
		for (Integer intElement : arrStream) {
			System.out.print(intElement + " ");
		}
	}

}
