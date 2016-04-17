/**
* Rectangle subclass implementation of abstract Shape superclass
* #width:double
* #length:double
* +Rectangle()
* +Rectangle(width:double, length:double)
* +Rectangle(width:double, length:double, colour:String, filled:boolean)
* +getWidth():double
* +setWidth(width:double):void
* +getLength():double
* +setLength(length:double):void
* +getArea():double
* +getPerimiter():double
* +toString():String
*/

public class Rectangle extends Shape {
	
	/**
	* protected member fields
	*/
	protected double width;
	protected double length;
	
	/**
	* constructors
	*/
	public Rectangle() {
		super();
		length = 1.0;
		width = 1.0;
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
	* getters
	*/
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	
	/**
	* setters
	*/
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	/**
	* toString()
	*/
	@Override
	public String toString() {
		return "[rectangle: instance=" + super.toString() + ", width=" + width + ", length=" + length + "]";
	}
	
	/**
	* overrided inherited abstract methods
	*/
	@Override
	public double getArea() {
		return length * width;
	}
	
	@Override
	public double getPerimiter() {
		return 2.0 * (length + width);
	}
	
}
