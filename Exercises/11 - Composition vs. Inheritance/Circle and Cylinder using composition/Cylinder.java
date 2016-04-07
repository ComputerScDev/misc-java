//	composition exercise
//	Cylinder subclass of Circle superclass
//	-base:Circle
//	-height:double = 1.0
//	+Cylinder()
//	+Cylinder(height:double)
//	+Cylinder(radius:double, height:double)
//	+getBase():Circle
//	+getHeight():double
//	+getVolume():double
//	+getBaseArea():double
//	+getArea():double
//	+toString():String

public class Cylinder {
	
	//	private member fields (variables)
	private Circle base;
	private double height;
	public static final double DEFAULT_HEIGHT = 1.0;
	
	//	constructors
	//	+Cylinder()
	public Cylinder() {
		base = new Circle(); // call Circle's no-arg constructor
		height = DEFAULT_HEIGHT;
	}
	
	//	+Cylinder(height:double)
	public Cylinder(double height) {
		base = new Circle(); // call Circle's no-arg constructor
		this.height = height;
	}
	
	//	+Cylinder(radius:double, height:double)
	public Cylinder(double radius, double height) {
		base = new Circle(radius); // calls Circle's one-arg constructor
		this.height = height;
	}
	
	//	getters
	//	+getBase():Circle
	public Circle getBase() {
		return base;
	}
	
	//	+getHeight():double
	public double getHeight() {
		return height;
	}
	
	//	public methods
	//	+getVolume():double
	public double getVolume() {
		return getBaseArea()*height;	// V = pi*r^2*h
	}
	
	//	+getBaseArea():double
	public double getBaseArea() {
		return base.getArea();	// calls superclass object's getArea method
		//	notice that we didn't have to use 'super' keyword
	}
	
	//	+getArea():double
	//	gives surface area of cylinder
	//	notice no need to @Override Circle's getArea() method
	public double getArea() {
		return (2*Math.PI*base.getRadius()*height) + (2*getBaseArea());	// area of two ends plus area of lateral portion
	}
	
	//	+toString():String
	//	notice no need to @Override Circle's toString() method
	public String toString() {
		return "cylinder instance state:\nsubclass of " + base.toString() + "\nheight = " + getHeight();
	}
}
