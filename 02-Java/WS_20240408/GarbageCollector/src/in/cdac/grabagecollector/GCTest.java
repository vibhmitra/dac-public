package in.cdac.grabagecollector;

public class GCTest {
	String objRef;
	GCTest(String objRef) {
		this.objRef = objRef;
	}
	
	public static void main(String[] args ) {
		GCTest t1 = new GCTest("t1");
		GCTest t2 = new GCTest("t2");
		t1 = t2;
		
		// invoking GC
		System.gc();
				
	}
	
	protected void finalize() {
		System.out.println("Object Previously Referenced By : " + this.objRef + "\nSuccessfully Collected Garbage.!");
	}
}
