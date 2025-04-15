package in.cdac.grabagecollector;

import java.util.Date;

public class RunTimeDemo {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		
		System.out.println("Total memory of heap: " + r.totalMemory());
		System.out.println("Free memory of heap: " + r.freeMemory());

		for (int i = 0; i < 20000; i++) {
			Date d = new Date();
			d = null;
		}
		
		System.out.println("Free memory of heap: " + r.freeMemory());
		r.gc();
		System.out.println("Free memory of heap: " + r.freeMemory());
		

	}

}
