package in.cdac.grabagecollector;

public class FinallizationGCCase3 {

	public static void main(String[] args) {
		FinallizationGCCase3 t = new FinallizationGCCase3();
		t.finalize();	// Case 3: Exception handled by GC
						// if we do not call it finalize
		t = null;
		System.gc();
		System.out.println("main method ends here");
	}
	
	protected void finalize() {
		System.out.println("Finalize method invoked");
		System.out.println(20/0);
		System.out.println("Finallize method ends");
	}

}
