/**
* Rectangle subclass
* needs to implement all abstract methods in Shape superclass
*/

public class Rectangle implements Shape {
	
	/**
	* private member variables
	*/
	private int length;
	private int width;
	
	/**
	* constructor
	*/
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public String toString() {
		return "rectangle[length=" + length + ", width =" + width + "]";
	}
	
	/**
	* need to implement all the abstract methods
	* defined in the interface
	*/
	@Override
	public double getArea() {
		return length*width;
	}
}
