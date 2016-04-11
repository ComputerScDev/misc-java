//	MovablePoint subclass of Point superclass

public class MovablePoint extends Point {
	
	//	private variables
	private float xSpeed;
	private float ySpeed;
	
	//	constructors
	//	+MovablePoint()
	public MovablePoint() {
		super();
		xSpeed = super.DEFAULT_VALUE;
		ySpeed = super.DEFAULT_VALUE;
	}
	
	//	+MovablePoint(x:float, y:float, xSpeed:float, ySpeed:float)
	public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	//	+MovablePoint(xSpeed:float, ySpeed:float) 
	public MovablePoint(float xSpeed, float ySpeed) {
		super();
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	//	getters
	//	+getXSpeed():float
	public float getXSpeed() {
		return xSpeed;
	}
	
	//	+getYSpeed():float
	public float getYSpeed() {
		return ySpeed;
	}
	
	//	getSpeed():float[2]
	public float[] getSpeed() {
		float[] getSpeed = new float[2];
		getSpeed[0] = xSpeed;
		getSpeed[1] = ySpeed;
		return getSpeed;
	}
	
	//	setters
	//	+setXSpeed(xSpeed:float):void
	public void setXSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}
	
	//	+setYSpeed(ySpeed:float):void
	public void setYSpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}
	
	//	+setSpeed(xSpeed:float, ySpeed:float):void
	public void setSpeed(float xSpeed, float ySpeed) {
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", speed = (" + xSpeed + ", " + ySpeed + ")";
	}
	
	public MovablePoint move() {
		super.setX(super.getX() + xSpeed);
		super.setY(super.getY() + ySpeed);
		return this;
	}
}
