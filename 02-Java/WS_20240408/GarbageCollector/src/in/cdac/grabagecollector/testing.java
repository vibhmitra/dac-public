package in.cdac.grabagecollector;

public class testing {

	public static void main(String[] args) {
		String str = new String("Hello");
		testing t = new testing();
		str = null;			// this is eligible for GC | therefore the finalize method of String class is working hence users finalize method will be overridden  
		System.gc();
		System.out.println("Main Ends Here");
	
	}
	
	protected void finalize() {
		System.out.println("Finalize method invoked");
	}

}
