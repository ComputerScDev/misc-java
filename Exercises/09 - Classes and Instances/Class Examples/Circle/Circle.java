//	Circle model class
//	-radius:double = 1.0
//	-colour:String = "red"
//	+Circle(radius:double, colour:String)
//	+Circle(radius:double)
//	+Circle()
//	+getRadius():double
//	+getColour():String
//	+setRadius(radius:double):void
//	+setColour(colour:String):void
//	+toString():String
//	+getArea():double

public class Circle {
	
	// constant member fields
	// public, accessible to outside
	// static, common to all instances
	public static final double DEFAULT_RADIUS = 8.8;
	public static final String DEFAULT_COLOUR = "red";
	
	// private member fields (variables)
	private double radius;
	private String colour;
	
	// overloaded constructors
	// first
	public Circle() {
		radius = DEFAULT_RADIUS;
		colour = DEFAULT_COLOUR;
	}
	
	// second
	public Circle(double radius) {
		// takes argument "radius" and sets it
		// as the value of the private field 'this.radius'
		this.radius = radius;
		colour = DEFAULT_COLOUR;
	}
	
	// third
	public Circle(double radius, String colour) {
		this.radius = radius;
		this.colour = colour;
	}
	
	// public getter and setter for private variables
	// getters
	public double getRadius() {
		return radius;
	}
	
	public String getColour() {
		return colour;
	}
	
	// setters
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	// public toString() for object/instance description
	public String toString() {
		return "Circle with radius = " + radius + " and colour of " + colour + ".";
	}
	
	// public methods
	public double getArea() {
		return radius*radius*Math.PI;
	}
}
