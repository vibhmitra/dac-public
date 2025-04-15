package in.cdac;

public class AnnonymusArray {

	public static int sum(int[] x) {
		int total = 0;
		/*
		for (int i : x) {
			total += i;
		}*/
		
		for (int i=0; i<x.length; i++)
		{	total += x[i];}
		return total;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Sum : " + sum(new int[] {2,3,7}));		// passing anonymous array
		
	}

}
