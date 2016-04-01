//	Cylinder subclass of Circle superclass
//	-height:double
//	+Cylinder()
//	+Cylinder(radius:double)
//	+Cylinder(radius:double, height:double)
//	+getHeight():double
//	+getVolume():double

public class Cylinder extends Circle {
	
	private double height;
	
	public Cylinder() {
		super();	//	invokes superclass constructor 'Circle()'
		this.height = 1.0;
	}
	
	public Cylinder(double radius, double height) {
		super(radius);	//	invokes superclass constructor 'Circle(radius)'
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		return super.getArea() * this.height;	// use superclass 'getArea()'
	}
	
	@Override
	public double getArea() {
		return 2*Math.PI*getRadius()*height + 2*super.getArea();
	}
	
	@Override
	public String toString() {
		return "cylinder properties: radius = " + getRadius() + ", height = " + getHeight();
	}
}
