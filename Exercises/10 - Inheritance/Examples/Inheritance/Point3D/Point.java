//	Composition example
//	Point model class
//	-x:int
//	-y:int
//	+Point()
//	+Point(x:int, y:int)
//	+getX():int
//	+getY():int
//	+setX(x:int):void
//	+setY(y:int):void
//	+toString():String

public class Point {
	
	//	private member fields (variables);
	private int x, y;
	
	//	constructors
	//	+Point()
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//	default (no-arg) constructor
	//	+Point(x:int, y:int)
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	//	+getX():int
	public int getX() {
		return this.x;
	}
	
	//	+getY():int
	public int getY() {
		return this.y;
	}
	
	//	+setX(x:int):void
	public void setX(int x) {
		this.x = x;
	}
	
	//	+setY(y:int):void
	public void setY(int y) {
		this.y = y;
	}
	
	//	+toString():String
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
}
