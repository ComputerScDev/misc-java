// Test method for Circle model class.

public class TestCircle {
	
	public static void main(String[] args) {
		// Declare and allocate an instance of class 'Circle' called c1
		// with default radius and colour
		Circle c1 = new Circle();
		
		// Use the dot operator to invoke methods of instance c1
		System.out.println("The " + c1.getColour() + " circle has radius r = " + c1.getRadius() + " and area " + c1.getArea() + ".");
		
		// Declare and allocate an instance of class 'Circle' called c2
		// with the given radius and default colour
		Circle c2 = new Circle(2.0);
		
		// Use the dot operator to invoke methods of instance c2
		System.out.println("The " + c2.getColour() + " circle has radius r = " + c2.getRadius() + " and area " + c2.getArea() + ".");
		
		// Declare and allocate an instance of class 'Circle' called c3
		// with the given radius and colour
		Circle c3 = new Circle(4.0, "purple");
		
		// Use the dot operator to invoke methods of instance c3
		System.out.println("The " + c3.getColour() + " circle has radius r = " + c3.getRadius() + " and area " + c3.getArea() + ".");
		
		// Test if we can access instance variables directly:
		//System.out.println(c1.radius);
		//c1.radius = 5;
		//System.out.println(c1.radius);
		// Result: Error, radius has private access in Circle class.
		System.out.println("\nNew methods test:");
		Circle c4 = new Circle();
		System.out.println("this new circle is " + c4.getColour() +" and has radius r = "+ c4.getRadius() + ".");
		c4.setRadius(5.0);
		c4.setColour("white");
		System.out.println("the new circle is now " + c4.getColour() +" and has radius r = "+ c4.getRadius() + ".");
		
		// Test the toString() method:
		System.out.println("\ntoString() methods test:");
		Circle c5 = new Circle(5.0);
		System.out.println(c5.toString());	// explicit call
		Circle c6 = new Circle(1.2);
		System.out.println(c6.toString());	// explicit call
		System.out.println(c6);	// println() calls toString() implicitly, same as above
		System.out.println("Operator '+' invokes toString() as well: \n" + c6);	// '+' invokes toString() too.
	}
}
