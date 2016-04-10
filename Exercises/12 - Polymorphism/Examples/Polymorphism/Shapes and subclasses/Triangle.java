/**	Polymorphism: separates the interface and the implementation
to allow the programmer to program -at the interface- in the design of
a complex system
*/

//	Triangle subclass of Shape superclass, using inheritance

public class Triangle extends Shape {
	
	//	private member fields (variables)
	private int base;
	private int height;
	
	//	constructor
	public Triangle(String colour, int base, int height) {
		super(colour);
		this.base = base;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "triangle[base=" + base + ", height=" + height + ", " + super.toString() + "]";
	}
	
	//	Override the inherited getArea()
	//	to provide the proper -implementation-
	@Override
	public double getArea() {
		return 0.5 * base * height;
	}
}
