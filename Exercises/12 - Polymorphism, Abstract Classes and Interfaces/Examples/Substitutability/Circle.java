//	Circle superclass

public class Circle {
	
	//	private member fields (variables)
	private double radius;
	private String colour;
	public static final double DEFAULT_RADIUS = 1.0;
	public static final String DEFAULT_COLOUR = "red";
	
	//	constructors
	//	+Circle()
	public Circle() {
		radius = DEFAULT_RADIUS;
		colour = DEFAULT_COLOUR;
	}
	
	//	+Circle(radius:double)
	public Circle(double radius) {
		this.radius = radius;
		colour = DEFAULT_COLOUR;
	}
	
	//	getter
	//	+getRadius():double
	public double getRadius() {
		return radius;
	}
	
	//	public methods
	//	+getArea():double
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	//	+toString():String
	public String toString() {
		return "circle instance state:\nradius = " + radius + ",\ncolour = " + colour + ",\narea = " + getArea();
	}
}
