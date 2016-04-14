/**
* Circle superclass
*/

public class Circle {
	
	/**
	* private member fields (variables)
	*/
	private double radius;
	
	/**
	* +Circle(radius:double)
	*/
	public Circle(double radius) {
		this.radius = radius;
	}
	
	/**
	* getter
	* +getRadius():double
	*/
	public double getRadius() {
		return this.radius;
	}
	
	/**
	* public methods
	* +getArea():double
	*/
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	/**
	* +toString():String
	*/
	public String toString() {
		return "circle instance state:\nradius = " + radius;
	}
}
