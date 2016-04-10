//	Cylinder subclass of Circle superclass
//	subclasses of superclasses exhibit a containment relationship

public class Cylinder extends Circle {
	
	private double height;
	
	//	constructors
	//	+Cylinder(radius:double, height:double)
	public Cylinder(double radius, double height) {
		super(radius);	// invokes superclass' second constructor
		this.height = height;
	}
	
	//	getter
	//	+getHeight():double
	public double getHeight() {
		return this.height;
	}
	
	//	+getVolume():double
	//	V = pi*r^2*h
	public double getVolume() {
		return super.getArea()*height;
	}
	
	@Override
	public double getArea() {
		return 2.0 * Math.PI * getRadius() * height;
	}
	
	@Override
	public String toString() {
		return "cylinder instance state:\nheight = " + height + "\nsubclass of " + super.toString();
	}
}
