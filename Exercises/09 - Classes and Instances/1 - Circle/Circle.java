//	Circle model class
//	-radius:double
//	-colour:String
//	+Circle()
//	+Circle(radius:double)
//	+Circle(radius:double, colour:String)
//	+getRadius():double
//	+getColour():String
//	+setRadius(radius:double):void
//	+setColour(colour:String):void
//	+getArea():double
//	+getPerimiter():double
//	+toString():String

public class Circle {
	
	// private instance variables, not accessible from outside this class
	private double radius;
	private String colour;
	
	// 1st constructor, which sets both radius & colour to default
	public Circle() {
		this.radius = 1.0;
		this.colour = "red";
	}
	
	// 2nd constructor, with given radius but colour default
	public Circle(double radius) {
		this.radius = radius;
		this.colour = "red";
	}

	// 3rd constructor, constructs a Circle instance with given radius and colour
	public Circle(double radius, String colour) {
		this.radius = radius;
		this.colour = colour;
	}
	
	// Getters
	// a public method for getting the radius value:
	public double getRadius() {
		return radius;
	}
	
	// a public method for getting the circle :
	public String getColour() {
		return colour;
	}
	
	// Setters:
	// a public setter for instance variable radius:
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// a public setter for instance variable colour:
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	// a public method for computing the circle's area
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	public String toString() {
		return "circle instance state: radius = " + this.radius + ", colour = " + this.colour + ".";
	}
}
