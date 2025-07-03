package javaconstructors.level1.circle;

	public class Circle {
	    double radius;

	    // Default constructor
	    public Circle() {
	        this(1.0); // Constructor chaining to parameterized constructor
	    }

	    // Parameterized constructor
	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    // Method to calculate area
	    public double getArea() {
	        return Math.PI * radius * radius;
	    }

	    public static void main(String[] args) {
	        Circle c1 = new Circle(); // uses default radius
	        Circle c2 = new Circle(3.5); // user-defined radius

	        System.out.println("Default Circle Area: " + c1.getArea());
	        System.out.println("Custom Circle Area: " + c2.getArea());
	    }
	}
