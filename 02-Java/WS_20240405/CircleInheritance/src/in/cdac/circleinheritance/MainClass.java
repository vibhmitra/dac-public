package in.cdac.circleinheritance;

 class Circle {
	private double radius;
	private String color;
	
	Circle() {
		this.radius = 1.0;
		this.color = "red";
	}
	
	Circle(double radius) {
		this.radius = radius;
		this.color = "red2"; // default color for parameterized constructor;
	}
	
	Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	// getter setter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}

	@Override
	public String toString() {
		return ("Area Circle : " + getArea() + "\nColor : " + color);
	}
}

class Cylinder extends Circle {
	private double height;
	
	Cylinder() {
		super();
		height = 1.0;
	}
	
	Cylinder(double height) {
		super();
		this.height = height;
	}
	
	Cylinder(double height, double radius) {
		super(radius);
		this.height = height;
	}
	
	Cylinder(double height, double radius, String color)
	{
		super(radius, color);
		this.height = height;
	}

	// getter setter
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		return getArea() * height;
	}

	@Override
	public String toString() {
		return ("Volume of Cylinder : " + getVolume() + '\n' + super.toString());
	}	
}

public class MainClass {

	public static void main(String[] args) {
		
		Cylinder c = new Cylinder(2,2);
		System.out.println(c);
		
		
		c.setColor("Orange");		// see c is now accessing the methods of its parent.
		System.out.println(c);
		
		c.setRadius(1);
		System.out.println(c);
		
		c.setHeight(3);
		System.out.println(c);
	}

}
