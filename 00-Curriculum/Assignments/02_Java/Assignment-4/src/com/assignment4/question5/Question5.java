package com.assignment4.question5;

// import java.util.Scanner;

class Shape {
	private String color;
	private boolean filled;

	public Shape() {
		this.color = "red";
		this.filled = true;
	}

	public Shape(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	@Override
	public String toString() {
		return ("color=" + color + ", filled=" + filled);
	}
}

class Circle extends Shape {
	private double radius;

	public Circle() {
		this.setRadius(1.0);
	}

	public Circle(double radius) {
		super();
		this.setRadius(radius);
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// methods
	double getArea() {
		return (3.14 * radius * radius);
	}

	double getPerimeter() {
		return (6.28 * radius);
	}

	void printCircleCalculations() {
		System.out.println("Area: " + this.getArea());
		System.out.println("Perimeter : " + this.getPerimeter());
	}

	@Override
	public String toString() {
		return ("Circle [radius=" + radius + ", " + super.toString() + "]");
	}
}

class Rectangle extends Shape {
	private double width;
	private double length;

	public Rectangle() {
		super();
		this.setWidth(1.0);
		this.setLength(1.0);
	}

	public Rectangle(double width, double length) {
		super();
		this.setWidth(width);
		this.setLength(length);
	}

	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.setWidth(width);
		this.setLength(length);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getArea() {
		return (this.getLength() * this.getWidth());
	}

	public double getPerimeter() {
		return 2 * (this.getLength() + this.getWidth());
	}
	
	void printRectangleCalculations() {
		System.out.println("Area: " + this.getArea());
		System.out.println("Perimeter : " + this.getPerimeter());
	}

	public String toString() {
		return ("Rectangle[" + super.toString() + ", width= " + this.getWidth() + ", length= " + this.getLength()
				+ "]");
	}

}

class Square extends Rectangle {
	public Square() {
		super();
	}

	public Square(double side) {
		super(side, side);
	}

	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}

	public String toString() {
		return "Square[" + super.toString() + "]";
	}

}

public class Question5 {

	public static void main(String[] args) {

		//// circle

		Circle circle1 = new Circle(4);
		System.out.println(circle1);
		circle1.printCircleCalculations();

		Circle circle2 = new Circle(9, "Oragnge", false);
		System.out.println(circle2);
		circle2.printCircleCalculations();

		//// rectangle
		Rectangle rec1 = new Rectangle();
		System.out.println(rec1);
		rec1.printRectangleCalculations();
		Rectangle rec2 = new Rectangle(3,4);
		System.out.println(rec2);
		rec2.printRectangleCalculations();
		Rectangle rec3 = new Rectangle(4,5, "Blue", false);
		System.out.println(rec3);
		rec3.printRectangleCalculations();
		
		
		//// square
		Square square1 = new Square();
		System.out.println(square1);
		square1.printRectangleCalculations();
		Square square2 = new Square(5);
		System.out.println(square2);
		square2.printRectangleCalculations();
		Square square3 = new Square(6, "Yellow", false);
		System.out.println(square3);
		square3.printRectangleCalculations();
	}

}
