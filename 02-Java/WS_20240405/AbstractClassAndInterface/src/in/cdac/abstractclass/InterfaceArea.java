package in.cdac.abstractclass;

interface Shape {
	public double getArea();
}

class Rectangle implements Shape {
	
	double length, breadth;
	
	Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public double getArea() {
		return length * breadth;
	}
	
	public String toString() {
		return "Area of Rectangle : " + getArea();
	}
}

class Triangle implements Shape {
	double base, height;
	
	Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public double getArea() {
		return (0.5) * base * height;
	}
	
	public String toString() {
		return "Area of Triangle : " + getArea();
	}
	
}

public class InterfaceArea {

	public static void main(String[] args) {
		
		Shape rectangle = new Rectangle(5,3);
		Shape triangle = new Triangle(5,2);
	
		System.out.println(rectangle);
		System.out.println(triangle);
	}

}
