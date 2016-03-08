// MyCircle model class

// Class 3-tuple:
// Name : MyCircle
// ----------------
// Static attributes:
// ----------------
// -Centre:MyPoint = {0, 0}
// -radius:double = 1.0
// ----------------
// Dynamic behaviors:
// ----------------
// +MyCircle()
// +MyCircle(xCentre:int, yCentre:int, radius:double)
// +MyCircle(Centre:MyPoint, radius:double)
// +getRadius():double
// +getCentre():MyPoint
// +getArea():double
// +getPerimeter():double
// +setRadius(radius:double):void
// +setCentre(Centre:MyPoint):void
// +setCentreX(x:int):void
// +setCentreY(y:int):void
// +setCentreXY(x:int, y:int):void
// +toString():String
// +distance(another:MyCircle):double

public class MyCircle {
	
	// private member fields (variables)
	private MyPoint centre;	// declare instance centre
	private double radius;
	
	// overloaded constructors
	// first
	public MyCircle() {
		centre = new MyPoint();	// construct instance object at (0,0)
		radius = 1.0;
	}
	
	// second
	public MyCircle(int xCentre, int yCentre, double radius) {
		centre = new MyPoint(xCentre, yCentre);	// construct instance object
		this.radius = radius;
	}
	
	public MyCircle(MyPoint centre, double radius) {
		this.centre = centre;
		this.radius = radius;
	}
	
	// public getters and setters for private variables
	// getters
	public double getRadius() {
		return radius;
	}
	
	public MyPoint getCentre() {
		return centre;
	}
	
	public int getCentreX() {
		return centre.getX();
	}
	
	public int getCentreY() {
		return centre.getY();
	}
	
	// setters
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setCentre(MyPoint centre) {
		this.centre = centre;
	}
	
	public void setCentreX(int x) {
		centre.setX(x);
	}
	
	public void setCentreY(int y) {
		centre.setY(y);
	}
	
	public void setCentreXY(int x, int y) {
		centre.setX(x);
		centre.setY(y);
	}
	
	// public toString() for object/instance description
	public String toString() {
		return "centre = " + centre + ", radius = " + radius;
	}
	
	// public methods
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	public double getPerimiter() {
		return 2.0*Math.PI*radius;
	}
	
	public double distance(MyCircle another) {
		return centre.distance(another.centre);	// use distance() method of MyPoint object
	}
}
