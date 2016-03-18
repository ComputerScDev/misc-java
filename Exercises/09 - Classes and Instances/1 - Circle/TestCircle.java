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
	}
}
