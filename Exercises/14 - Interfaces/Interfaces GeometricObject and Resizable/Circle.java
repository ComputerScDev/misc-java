/**
* Circle class implements GeometricObject interface
*/

public class Circle implements GeometricObject {
	
	/**
	* protected variable
	*/
	protected double radius = 1.0;
	
	/**
	* constructor
	*/
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "circle of radius r:" + radius;
	}
	
	/**
	* implement abstract methods in interface
	*/
	@Override
	public double getPerimiter() {
		return 2.0 * Math.PI * radius;
	}
	
	@Override
	public double getArea() {
		return 4.0 * Math.PI * radius * radius;
	}
}
