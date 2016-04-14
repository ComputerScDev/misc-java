/**
* abstract superclass Shape
*/

abstract public class Shape {
	
	/**
	* private member field (variable)
	*/
	private String colour;
	
	/**
	* constructor
	*/
	public Shape(String colour) {
		this.colour = colour;
	}
	
	@Override
	public String toString() {
		return "shape object of colour = \"" + colour + "\"";
	}
	
	/**	note below is an abstract method, showing only its signature
	* and without an implementation (i.e. method body). we use keyword 
	* 'abstract' to declare an abstract method.
	* all Shape subclasses must implement a method called getArea()
	*/
	abstract public double getArea();
}
