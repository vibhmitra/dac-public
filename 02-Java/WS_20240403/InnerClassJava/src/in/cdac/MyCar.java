package in.cdac;

public class MyCar {
	
	public static void main(String[] args) {
		Car c = new Car() {						// Anonymous Inner Class
			public void Honda() {				// Override
				System.out.println("Details");
			}
		};
		
		c.Honda();
		Car c1 = new Car();
		c1.Honda();
	}
}
