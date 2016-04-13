/**
* Point model superclass
*/

public class Point {
	
	private float x;
	private float y;
	public static final float DEFAULT_VALUE = 0.0f;
	
	/**
	* constructors
	*/
	public Point() {
		x = DEFAULT_VALUE;
		y = DEFAULT_VALUE;
	}
	
	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	* getters
	*/
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public float[] getXY() {
		float[] getXY = new float[2];
		getXY[0] = x;
		getXY[1] = y;
		return getXY;
	}
	
	/** 
	* setters
	*/
	public void setX(float x) {
		this.x = x;
	}
	
	public void setY(float y) {
		this.y = y;
	}
	
	public void setXY(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	* toString()
	*/
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
