//	Test class
//	IMPORTANT: this is where we see substitutability, notice...

public class TestCircle {
	
	public static void main(String[] args) {
		Circle c1 = new Cylinder(5.0);	// we substitute a subclass instance to its superclass reference
		System.out.println("circle #1 properties:\n"
		+ "radius = " + c1.getRadius() + "\n"
		+ "colour = " + c1.getColour() + "\n"
		+ c1.toString() + "\n");	// c1, despite being a circle, internally holds a cylinder object
									//	so here we invoke the overridden cylinder version of toString() 
	}
}
