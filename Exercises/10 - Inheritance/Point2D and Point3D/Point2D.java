//	2D Point model class
//	-x:float = 0.0f
//	-y:float = 0.0f
//	+Point2D(x:float, y:float)
//	+Point2D()
//	+getX():float
//	+getY():float
//	+getXY():float[2]
//	+setX(x:float):void
//	+setY(y:float):void
//	+setXY(x:float, y:float):void
//	+toString():String

public class Point2D {
	
	//	private member fields (variables)
	private float x;
	private float y;
	public static final float DEFAULT_VALUE = 0.0f;
	
	//	constructors
	//	+Point2D()
	public Point2D() {
		this.x = DEFAULT_VALUE;
		this.y = DEFAULT_VALUE;
	}
	
	//	+Point2D(x:float, y:float)
	public Point2D(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	//	getters
	//	+getX():float
	public float getX() {
		return x;
	}
	
	//	+getY():float
	public float getY() {
		return y;
	}
	
	//	+getXY():float[2]
	public float[] getXY() {
		float[] getXY = new float[2];
		getXY[0] = x;
		getXY[1] = y;
		return getXY;
	}
	
	//	setters
	//	+setX(x:float):void
	public void setX(float x) {
		this.x = x;
	}
	
	//	+setY(y:float):void
	public void setY(float y) {
		this.y = y;
	}
	
	//	+setXY(x:float, y:float):void
	public void setXY(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	//	toString()
	//	+toString():String
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
