//	Ball model class
//	(x,y) represents the ball's centre
//	xDelta and yDelta represent displacement per step in
//	their respective directions
//	-x:float
//	-y:float
//	-radius:int
//	-xDelta:float
//	-yDelta:float
//	+Ball(x:int, y:int, radius:int, speed:int, direction:int)
//	+getX():int
//	+getY():int
//	+getRadius():int
//	+getxDelta():float
//	+getyDelta():float
//	+setX(x:float):void
//	+setY(y:float):void
//	+setRadius(radius:int):void
//	+setxDelta(xDelta:float):void
//	+setyDelta(yDelta:float):void
//	+setXY(x:int, y:int):void
//	+move():void
//	+reflectHorizontal():void
//	+reflectVertical():void
//	+toString():String

public class Ball {
	
	//	private member fields (variables)
	private float x;
	private float y;
	private int radius;
	private float xDelta;
	private float yDelta;
	
	//	constructor
	//	+Ball(x:int, y:int, radius:int, speed:int, direction:int)
	public Ball(int x, int y, int radius, int speed, int direction) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.xDelta = speed * (float)Math.cos(direction);
		this.yDelta = -speed * (float)Math.sin(direction);
	}
	
	//	+getX():int
	public int getX() {
		return (int)this.x;
	}
	
	//	+getY():int
	public int getY() {
		return (int)this.y;
	}
	
	//	+getRadius():int
	public int getRadius() {
		return this.radius;
	}
	
	//	+getxDelta():float
	public float getxDelta() {
		return this.xDelta;
	}
	
	//	+getyDelta():float
	public float getyDelta() {
		return this.yDelta;
	}
	
	//	+setX(x:float):void
	public void setX(float x) {
		this.x = x;
	}
	
	//	+setY(y:float):void
	public void setY(float y) {
		this.y = y;
	}
	
	//	+setRadius(radius:int):void
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//	+setxDelta(xDelta:float):void
	public void setxDelta(float xDelta) {
		this.xDelta = xDelta;
	}
	
	//	+setyDelta(yDelta:float):void
	public void setyDelta(float yDelta) {
		this.yDelta = yDelta;
	}
	
	//	+setXY(x:int, y:int):void
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//	+move():void
	public void move() {
		this.x += this.xDelta;
		this.y += this.yDelta;
	}
	
	//	+reflectHorizontal():void
	public void reflectHorizontal() {
		this.xDelta = -this.xDelta;
	}
	
	//	+reflectVertical():void
	public void reflectVertical() {
		this.yDelta = -this.yDelta;
	}
	
	//	+toString():String
	public String toString() {
		return "Ball at (" + this.x + ", " + this.y + ") of velocity (" + this.xDelta + ", " + this.yDelta + ").";
	}	
}
