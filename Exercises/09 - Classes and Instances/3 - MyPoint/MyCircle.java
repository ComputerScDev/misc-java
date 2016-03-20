// MyCircle model class
//	-centre:MyPoint
//	-radius:int = 1
//	+MyCircle(x:int, y:int, radius:int)
//	+MyCircle(centre:MyPoint, radius:int)
//	+getRadius():int
//	+getCentre():MyPoint
//	+getCentreX():int
//	+getCentreY():int
//	+setCentre(centre:MyPoint):void
//	+setCentreXY(x:int, y:int):void
//	+setRadius(radius:int):void
//	+toString():String
//	+getArea():double

public class MyCircle {
	
	// private member fields (variables)
	private MyPoint centre;
	private int radius = 1;
	
	// public constructors
	public MyCircle(int x, int y, int radius) {
		this.centre = new MyPoint(x, y);
		this.radius = radius;
	}
	
	public MyCircle(MyPoint centre, int radius) {
		this.centre = centre;
		this.radius = radius;
	}
	
	// public getters and setters for private variables
	public int getRadius() {
		return this.radius;
	}
	
	public MyPoint getCentre() {
		return this.centre;
	}
	
	public void setCentre(MyPoint centre) {
		this.centre = centre;
	}
	
	public void setCentreXY(int x, int y) {
		this.centre = new MyPoint(x, y);
	}
	
	// public extra methods
	public int getCentreX() {
		return this.centre.getX();
	}
	
	public int getCentreY() {
		return this.centre.getY();
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	// toString()
	public String toString() {
		return "circle @ " + this.centre.toString() + ", radius = " + this.radius;
	}
}
