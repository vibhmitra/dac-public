package in.cdac.thisissuper;

class Fruits {
	Fruits() {
		super();
		System.out.println("Fruit Class Constructor");
	}
	
	Fruits(int x) {
		System.out.println("Parametrized Fruit Class Constructor.");
	}
}


public class Apple extends Fruits {

	Apple() {
		super();	// It is optional | added by compiler at the compile time
		System.out.println("Apple Class Constructor");
	}
	
	public static void main(String[] args) {
		Apple a = new Apple();
		Fruits f = new Fruits(6);
	}

}
