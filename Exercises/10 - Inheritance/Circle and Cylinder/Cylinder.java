public class Cylinder extends Circle {
	
	private static final double DEFAULT_HEIGHT = 1.0;
	private double height;
	
	/**
	 * constructors
	 * /
	public Cylinder() {
		super();	// invokes superclass' no-arg constructor
		height = DEFAULT_HEIGHT;
	}
	
	public Cylinder(double height) {
		super();	// invokes superclass' no-arg constructor
		this.height = height;
	}
	
	public Cylinder(double radius, double height) {
		super(radius);	// invokes superclass' second constructor
		this.height = height;
	}
	
	/**
	 * public methods
	 * /
	public double getHeight() {
		return height;
	}
	
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
