public class Circle {
	
	// private instance variables, not accessible from outside this class
	private double radius;
	private String colour;
	
	// 1st constructor, which sets both radius & colour to default
	public Circle() {
		radius = 1.0;
		colour = "red";
	}
	
	// 2nd constructor, with given radius but colour default
	public Circle(double r) {
		radius = r;
		colour = "red";
	}
	
	// a public method for getting the radius value
	public double getRadius() {
		return radius;
	}
	
	// a public method for computing the circle's area
	public double getArea() {
		return radius*radius*Math.PI;
	}	
}
