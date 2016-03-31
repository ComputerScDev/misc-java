//	MyPoint model class
//	models a point in R^2
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
	
	//	private member fields (variables)
	private int x;
	private int y;
	
	//	overloaded onstructors
	public MyPoint() {
		x = 0;
		y = 0;
	}
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//	public getters and setters for private variables
	//	getters
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	//	setters
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
	
	//	public toString() for object/instance description
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	//	public methods
	//	overloaded distance methods
	//	compute distance from point object to given point as implicit argument
	public double distance(int x, int y) {
		int xDiff = this.x - x;
		int yDiff = this.y - y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	
	//	compute distance from point object to given explicit point object argument
	public double distance(MyPoint another) {
		int xDiff = this.x - another.x;
		int yDiff = this.y - another.y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
}
