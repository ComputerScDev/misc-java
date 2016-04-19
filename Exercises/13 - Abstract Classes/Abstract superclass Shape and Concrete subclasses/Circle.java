/**
* Circle subclass implementation of abstract Shape superclass
* #radius:double
* +Circle()
* +Circle(radius:double)
* +Circle(radius:double, colour:String, filled:boolean)
* +getRadius():double
* +setRadius(radius:double):void
* +getArea():double
* +getPerimiter():double
* +toString():String
*/

public class Circle extends Shape {
	
	/**
	* protected member fields
	*/
	protected double radius;
	
	/**
	* constructors
	*/
	public Circle() {
		super();
		radius = 1.0;
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
	* getter and setter for radius
	*/
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/**
	* toString()
	*/
	@Override
	public String toString() {
		return "[circle: instance=" + super.toString() + ", radius=" + radius + "]";
	}
	
	/**
	* overrided inherited abstract methods
	*/
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public double getPerimiter() {
		return 2.0 * Math.PI * radius;
	}
}
