package in.cdac.grabagecollector;

public class Finalizer {

	private int id;
	public Finalizer(int id) {
		this.id = id;		
	}
	
	public void finalize() {
		if (id % 50 == 0) 
			System.out.println("Finalize() meth called for : " +id);
	}
	
	public static void main(String[] args) {
		
		// creating 1000 objects of Finalizer Class
		for (int i =1; i <=1000000; i++) {
			new Finalizer(i);	// we are giving reference 
			
		}
		System.gc(); // Invoking the GC

	}

}
