//	Container model class
//	models the enclosing box for the ball
//	(x1, y1) denotes top-left corner of box
//	(x2, y2) denotes bottom right corner of box
//	-x1:int
//	-y1:int
//	-x2:int
//	-y2:int
//	+Container(x:int, y:int, width:int, height:int)
//	+getX1():int
//	+getY1():int
//	+getX2():int
//	+getY2():int
//	+setX1(x1:int):void
//	+setY1(y1:int):void
//	+setX2(x2:int):void
//	+setY2(y2:int):void
//	+collidesWith(ball:Ball):boolean
//	+toString():String

public class Container {
	
	//	private member fields (variables)
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	//	constructor
	//	+Container(x:int, y:int, width:int, height:int)	
	public Container(int x, int y, int width, int height) {
		this.x1 = x;
		this.y1 = y;
		this.x2 = this.x1 + width - 1;
		this.y2 = this.y1 + height - 1;
	}
	
	//	+getX1():int
	public int getX1() {
		return this.x1;
	}
	
	//	+getY1():int
	public int getY1() {
		return this.y1;
	}
	
	//	+getX2():int
	public int getX2() {
		return this.x2;
	}
	
	//	+getY2():int
	public int getY2() {
		return this.y2;
	}
	
	//	+setX1(x1:int):void
	public void setX1(int x1) {
		this.x1 = x1;
	}
	
	//	+setY1(y1:int):void
	public void setY1(int y1) {
		this.y1 = y1;
	}
	
	//	+setX2(x2:int):void
	public void setX2(int x1) {
		this.x2 = x2;
	}
	
	//	+setY2(y2:int):void
	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	//	+collidesWith(ball:Ball):boolean
	public boolean collidesWith(Ball ball) {
		if (((ball.getX() - ball.getRadius()) <= this.x1) || ((ball.getX() - ball.getRadius()) >= this.x2)) {
			ball.reflectHorizontal();
			return true;
		}
		
		if (((ball.getY() - ball.getRadius()) <= this.y1) || ((ball.getY() - ball.getRadius()) >= this.y2)) {
			ball.reflectVertical();
			return true;
		}
		
		return false;
	}
	
	//	+toString():String
	public String toString() {
		return "container at (" + this.x1 + ", " + this.y1 + ") to (" + this.x2 + ", " + this.y2 + ").";
	}
}
