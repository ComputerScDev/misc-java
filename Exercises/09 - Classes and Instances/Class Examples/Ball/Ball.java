//	Ball model class
//	models position of a moving ball
//	-x:double = 0.0
//	-y:double = 0.0
//	+Ball(x:double, y:double)
//	+Ball()
//	+getX():double
//	+getY():double
//	+setX(x:double):void
//	+setY(y:double):void
//	+setXY(x:double, y:double):void
//	+move(xDisp:double, yDisp:double):void
//	+toString():String

public class Ball {
	
	// private member fields (variables)
	private double x, y;
	
	// overloaded constructors
	// first
	public Ball(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	// second
	// instantiates ball object centred at the origin
	public Ball() {
		x = 0.0;
		y = 0.0;
	}
	
	// public getters and setters for private variables x, y
	// getters
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	// setters
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	// dual x,y setter
	public void setXY(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	// public method
	public void move(double xDisp, double yDisp) {
		x += xDisp;
		y += yDisp;
	}
	
	// public toString() for object/instance description
	public String toString() {
		return "Ball @ (" + x + ", " + y + ")";
	}
}
