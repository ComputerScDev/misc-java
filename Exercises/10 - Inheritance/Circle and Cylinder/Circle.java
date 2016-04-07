//	Circle model superclass
//	-radius:double = 1.0
//	-colour:String = "red"
//	+Circle()
//	+Circle(radius:double)
//	+getRadius():double
//	+getArea():double
//	+toString():String

public class Circle {
	
	private double radius;
	private String colour;
	public static final double DEFAULT_RADIUS = 1.0;
	public static final String DEFAULT_COLOUR = "red";
	
	//	constructors
	public Circle() {
		radius = DEFAULT_RADIUS;
		colour = DEFAULT_COLOUR;
	}
	
	public Circle(double radius) {
		this.radius = radius;
		colour = DEFAULT_COLOUR;
	}
	
	//	getter
	public double getRadius() {
		return radius;
	}
	
	//	public methods
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	//	if invoked in  Cylinder, and we use getArea() here, this method's
	//	getArea() invocation will be that of Cylinder's getArea, so we
	//	replace that with radius*radius*Math.PI;
	public String toString() {
		return "circle instance state:\nradius = " + radius + ",\ncolour = " + colour + ",\narea = " + radius*radius*Math.PI;
	}	
}
