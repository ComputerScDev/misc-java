/**	abstract Shape superclass and its subclasses.
Rectangle subclass of Shape superclass, using inheritance
*/

public class Rectangle extends Shape {
	
	//	private member fields (variables)
	private int length;
	private int width;
	
	//	constructor
	public Rectangle(String colour, int length, int width) {
		super(colour);
		this.length = length;
		this.width = width;
	}
	
	@Override
	public String toString() {
		return "rectangle[length=" + length + ", width=" + width + ", " + super.toString() + "]";
	}
	
	//	Override the inherited getArea() 
	//	to provide proper -implementation-
	@Override
	public double getArea() {
		return length * width;
	}
}
