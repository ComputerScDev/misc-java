//	Circle model subclass of Shape superclass
//	-radius:double = 1.0
//	+Circle()
//	+Circle(radius:double)
//	+Circle(radius:double, colour:String, filled:boolean)
//	+getRadius():double
//	+setRadius(radius:double):void
//	+getArea():double
//	+getPerimeter():double
//	+toString():String

public class Circle extends Shape {
	
	private double radius;
	private static final double DEFAULT_RADIUS = 1.0;
	
	//	constructors
	//	+Circle()
	public Circle() {
		super();
		radius = DEFAULT_RADIUS;
	}
	
	//	+Circle(radius:double)
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	//	+Circle(radius:double, colour:String, filled:boolean)
	public Circle(double radius, String colour, boolean filled) {
		super(colour, filled);
		this.radius = radius;
	}
	
	//	getters and setters
	//	+getRadius():double
	public double getRadius() {
		return radius;
	}
	
	//	+setRadius(radius:double):void
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//	public methods
	//	+getArea():double
	public double getArea() {
		return Math.PI*getRadius()*getRadius();
	}
	
	//	+getPerimeter():double
	public double getPerimeter() {
		return 2*Math.PI*getRadius();
	}
	
	//	+toString():String
	@Override
	public String toString() {
		return "a circle of radius " + getRadius() + ", subclass of " + super.toString();
	}
}
