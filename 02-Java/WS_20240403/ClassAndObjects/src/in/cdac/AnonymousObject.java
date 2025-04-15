package in.cdac;

public class AnonymousObject {

	String name = "Vibhan";
	int n1, n2;
	AnonymousObject() {
		System.out.println("Default Constructor.");
	}
	
	AnonymousObject(int x, int y) {
		n1 = x;
		n2 = y;
		System.out.println("Result : " + (n1 * n2));
	}
	
	void addition(int a, int b) {
		n1 = a;
		n2 = b;
		System.out.println("Addition : " + (n1 + n2));
	}
	
	
	void start() {
		System.out.println("Class Started Executing.");
	}
	
	void stop() {
		System.out.println("Class End.");
	}
	
	public static void main(String[] args) {
		/*
		 * AnonymousObject ao = new AnonymousObject(); 
		 * System.out.println(ao.name);
		 * ao.start(); ao.stop();
		 */
		System.out.println(new AnonymousObject().name);
		new AnonymousObject().start();			// This is anonymous object which does't have name.
		new AnonymousObject().stop();
		// new AnonymousObject().start().stop();	// this will throw error
		new AnonymousObject(9,8).addition(3, 4);
	}

}
