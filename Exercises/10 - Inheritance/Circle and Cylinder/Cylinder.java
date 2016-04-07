//	Cylinder model subclass of Circle superclass
//	-height:double = 1.0
//	+Cylinder()
//	+Cylinder(height:double)
//	+Cylinder(radius:double, height:double)
//	+getHeight():double
//	+getVolume():double

public class Cylinder extends Circle {
	
	private static final double DEFAULT_HEIGHT = 1.0;
	private double height;
	
	//	constructors
	//	+Cylinder()
	public Cylinder() {
		super();	// invokes superclass' no-arg constructor
		height = DEFAULT_HEIGHT;
	}
	
	//	+Cylinder(height:double)
	public Cylinder(double height) {
		super();	// invokes superclass' no-arg constructor
		this.height = height;
	}
	
	//	+Cylinder(radius:double, height:double)
	public Cylinder(double radius, double height) {
		super(radius);	// invokes superclass' second constructor
		this.height = height;
	}
	
	//	public methods
	//	+getHeight():double
	public double getHeight() {
		return height;
	}
	
	//	+getVolume():double
	//	V = pi*r^2*h
	public double getVolume() {
		return getBaseArea()*height;
	}
	
	public double getBaseArea() {
		return super.getArea();
	}
	
	@Override
	public double getArea() {
		return (2*Math.PI*getRadius()*height) + (2*getBaseArea());
	}
	
	@Override
	public String toString() {
		return "cylinder instance state:\nsubclass of " + super.toString() + "\nheight = " + getHeight();
	}
}
