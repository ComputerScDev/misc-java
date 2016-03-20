//	MyPoint model class
//	-x:int = 0
//	-y:int = 0
//	+MyPoint()
//	+MyPoint(x:int, y:int)
//	+getX():int
//	+getY():int
//	+setX(x:int):void
//	+setY(y:int):void
//	+setXY(x:int, y:int):void
//	+toString():String
//	+distance(x:int, y:int):double
//	+distance(another:MyPoint):double

public class MyPoint {
	
	// private member fields (variables)
	private int x = 0;
	private int y = 0;
	
	// public constructors
	public MyPoint() {
	}
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// public getters for private variables
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	// public setters for private variables
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// toString() method returns string in format "(x, y)".
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
	
	// extra public methods
	// first distance method, computes distance from this instance object point to the given argument "point"
	public double distance(int x, int y) {
		return Math.sqrt((this.x - x)*(this.x - x) + (this.y - y)*(this.y - y));
	}
	
	// second distance method from this instance object point to a given point object argument
	public double distance(MyPoint another) {
		return this.distance(another.getX(), another.getY());
	}
	
}
