package in.cdac.grabagecollector;

public class FinallizationGCCase4 {

	public static void main(String[] args) {
		FinallizationGCCase4 t = new FinallizationGCCase4();
		t.finalize();		// invoking explicitly
		t.finalize();		// invoking explicitly
		t = null;
		System.gc();  	// GC invokes finalize
		System.out.println("M<ain Ends");
		
	}
	
	protected void finalize() {
		System.out.println("Finalize invoked");
	}

}
