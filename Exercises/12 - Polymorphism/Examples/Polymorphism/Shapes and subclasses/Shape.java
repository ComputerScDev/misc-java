/**	
* Polymorphism: separates the interface and the implementation
* to allow the programmer to program -at the interface- in the design of
* a complex system
* Below: Shape superclass
*/

public class Shape {
	
	/**
	* private member fields (variables)
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
		return "shape[colour=" + colour + "]";
	}
	
	/**
	* All shapes must have a method called getArea()
	*/
	public double getArea() {
		/**
		* we have a problem here
		* we need to return some value to compile the program
		* (note that we resolve this issue with abstract classes)
		*/
		System.err.println("shape unknown, cannot compute area");
		return 0;
	}
}
