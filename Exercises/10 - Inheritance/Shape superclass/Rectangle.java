public class Rectangle extends Shape {
	
	private double width;
	private double length;
	private static final double DEFAULT_VALUE = 1.0;
	
	/**
	 * constructors
	 */
	public Rectangle() {
		super();
		width = DEFAULT_VALUE;
		length = DEFAULT_VALUE;
	}
	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length, String colour, boolean filled) {
		super(colour, filled);
		this.width = width;
		this.length = length;
	}
	
	/**
	 * getters and setters
	 */
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	/**
	 * public methods
	 */
	public double getArea() {
		return length*width;
	}
	
	public double getPerimeter() {
		return 2*(length + width);
	}
	
	@Override
	public String toString() {
		return "a rectangle of width " + getWidth() + " and length " + getLength() + ", a subclass of " + super.toString();
	}
}
