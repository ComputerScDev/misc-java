//	Circle superclass
//	-radius:double
//	-colour:String
//	+Circle()
//	+Circle(radius:double)
//	+getRadius():double
//	+getArea():double

public class Circle {

	public static final double DEFAULT_RADIUS = 8.8;
	public static final String DEFAULT_COLOUR = "red";
	private double radius;
	private String colour;
	
	public Circle() {
		radius = DEFAULT_RADIUS;
		colour = DEFAULT_COLOUR;
	}
	
	public Circle(double radius) {
		this.radius = radius;
		colour = DEFAULT_COLOUR;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
}
