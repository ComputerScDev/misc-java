//	Rectangle model subclass of Shape superclass
//	-width:double = 1.0
//	-length:double = 1.0
//	+Rectangle()
//	+Rectangle(width:double, length:double)
//	+Rectangle(width:double, length:double, colour:String, filled:boolean)
//	+getWidth():double
//	+getLength():double
//	+setWidth(width:double):void
//	+setLength(length:double):void
//	+getArea():double
//	+getPerimeter():double
//	+toString():String

public class Rectangle extends Shape {
	
	private double width;
	private double length;
	private static final double DEFAULT_VALUE = 1.0;
	
	//	constructors
	//	+Rectangle()
	public Rectangle() {
		super();
		width = DEFAULT_VALUE;
		length = DEFAULT_VALUE;
	}
	
	//	+Rectangle(width:double, length:double)
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	//	+Rectangle(width:double, length:double, colour:String, filled:boolean)
	public Rectangle(double width, double length, String colour, boolean filled) {
		super(colour, filled);
		this.width = width;
		this.length = length;
	}
	
	//	getters
	//	+getWidth():double
	public double getWidth() {
		return width;
	}
	
	//	+getLength():double
	public double getLength() {
		return length;
	}
	
	//	setters
	//	+setWidth(width:double):void
	public void setWidth(double width) {
		this.width = width;
	}
	
	//	+setLength(length:double):void
	public void setLength(double length) {
		this.length = length;
	}
	
	//	public methods
	//	+getArea():double
	public double getArea() {
		return length*width;
	}
	
	//	+getPerimeter():double
	public double getPerimeter() {
		return 2*(length + width);
	}
	
	//	+toString():String
	@Override
	public String toString() {
		return "a rectangle of width " + getWidth() + " and length " + getLength() + ", a subclass of " + super.toString();
	}
}
