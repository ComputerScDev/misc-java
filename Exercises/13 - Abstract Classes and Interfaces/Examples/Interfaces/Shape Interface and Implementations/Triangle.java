/**
* Triangle subclass
* needs to implement all abstract methods in Shape superclass
*/

public class Triangle implements Shape {
	
	/**
	* private member variables
	*/
	private int base;
	private int height;
	
	/**
	* constructor
	*/
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "triangle[base=" + base + ", height =" + height + "]";
	}
	
	/**
	* need to implement all the abstract methods
	* defined in the interface
	*/
	@Override
	public double getArea() {
		return 0.5 * base * height;
	}
}
