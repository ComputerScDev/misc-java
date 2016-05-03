public class Circle extends Shape {
	
	private double radius;
	private static final double DEFAULT_RADIUS = 1.0;
	
	/**
	 * constructors
	 */
	public Circle() {
		super();
		radius = DEFAULT_RADIUS;
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(double radius, String colour, boolean filled) {
		super(colour, filled);
		this.radius = radius;
	}
	
	/**
	 * getters and setters
	 */
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/**
	 * public methods
	 */
	public double getArea() {
		return Math.PI*getRadius()*getRadius();
	}
	
	public double getPerimeter() {
		return 2*Math.PI*getRadius();
	}
	
	@Override
	public String toString() {
		return "a circle of radius " + getRadius() + ", subclass of " + super.toString();
	}
}
