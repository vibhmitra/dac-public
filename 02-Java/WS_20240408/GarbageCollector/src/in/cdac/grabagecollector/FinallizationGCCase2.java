package in.cdac.grabagecollector;

public class FinallizationGCCase2 {

			
	
			public static void main(String[] args) {
				String str = new String("Hello");
				FinallizationGCCase2 t = new FinallizationGCCase2();
				str = null;			// this is eligible for GC | therefore the finalize method of String class is working hence users finalize method will be overridden  
				
				t = null;			// case 2: explicitly we are giving GC that this method is not useful
				System.gc();
				System.out.println("Main Ends Here");
			
			}
			
			protected void finalize() {
				System.out.println("Finalize method invoked");
			}

		}
