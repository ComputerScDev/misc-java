//	composition vs inheritance exercise
//	Point model class

public class Point {
	
	//	private member fields (variables)
	private int x;
	private int y;
	
	//	constructor
	//	+Point(x:int, y:int)
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//	public methods
	public String toString() {
		return "(" + x + ", " + y + ")";
		//	"point object state: "
	}
	
	//	getters
	//	+getX():int
	public int getX() {
		return x;
	}
	
	//	+getY():int
	public int getY() {
		return y;
	}
	
	//	setters
	//	+setX(x:int):void
	public void setX(int x) {
		this.x = x;
	}
	
	//	+setY(y:int):void
	public void setY(int y) {
		this.y = y;
	}
	
	//	+setXY(x:int, y:int):void
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
