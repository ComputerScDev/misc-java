/**
* Test driver for ResizableCircle class
*/

public class TestResizableCircle {
	
	public static void main(String[] args) {
		ResizableCircle c1 = new ResizableCircle(1.0);	// cannot upcast to Resizable since no common Circle methods as below
		System.out.println("new resizable circle: " + c1);
		System.out.println("perimiter: " + c1.getPerimiter());
		System.out.println("area: " + c1.getArea());
		System.out.println("\nresizing...\n");
		c1.resize(200);	// cannot upcast to Circle since no Circle resize method
		System.out.println("resized circle: " + c1);
		System.out.println("perimiter: " + c1.getPerimiter());
		System.out.println("area: " + c1.getArea());
	}
}
