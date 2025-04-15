/* Problem 5: WAP to find Area and Perimeter of -->  Rectangle, Right angled Triangle using class and object. */
package cdac.assignments.one;

import java.util.Scanner;

public class Prob5 {
	// Class for Area
	public static class Area {
        float circle(float radius) { return (3.14f * radius * radius); }
        float rectangle(float sideA, float sideB) { return (sideA * sideB); }
        float triangle(float base, float height) { return (0.5f * base * height); }
	}
	
	// Class For Perimeter
	public static class Perimeter {
        float circle(float radius) { return (2 * 3.14f * radius); }
        float rectangle(float sideA, float sideB) { return (2 * (sideA + sideB)); }
        float triangle(float base, float height) {
        	float thirdSide = (float) Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        	return (base + height + thirdSide);
        }
	}
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		Area getArea = new Area();
        Perimeter getPerimeter = new Perimeter();
        int userChoice;
        
        System.out.println("Choose > ");
        System.out.println("\t1. Circle");
        System.out.println("\t2. Rectangl");
        System.out.println("\t3. Triangle(R-A)");
        System.out.print("Enter You Choice » ");
        userChoice = userInput.nextInt();
        
        switch (userChoice) {
            case (1):
                float radius;
                System.out.println("CIRCLE :: ");
                System.out.print("Enter Radius > ");
                radius = userInput.nextFloat();
                System.out.println("AREA : " + getArea.circle(radius));
                System.out.println("CIRCUMFERENCE : " + getPerimeter.circle(radius));
                break;
            case (2):
                System.out.println("RECTANGLE :: ");
                System.out.print("Enter Length > ");
                float length = userInput.nextFloat();
                System.out.print("Enter Breadth > ");
                float breadth = userInput.nextFloat();
                System.out.println("AREA : " + getArea.rectangle(length, breadth));
                System.out.println("PERIMETER : " + getPerimeter.rectangle(length, breadth));
                break;
            case (3):
            	System.out.println("RIGHT-ANGLE TRIANGLE :: ");
	            System.out.print("Enter Base > ");
	            float height = userInput.nextFloat();
	            System.out.print("Enter Height > ");
	            float base = userInput.nextFloat();
	            System.out.print("AREA : " + getArea.triangle(base, height));
	            System.out.println("PERIMETER : " + getPerimeter.triangle(base, height));
	            break;
            default :
            	System.out.println("Wrong Choice!");
            	break;
        }
        userInput.close();
	}
}
