/**
* Test driver for Shape interface
*/

public class TestShape {
	
	public static void main(String[] args) {
		Shape s1 = new Rectangle(1, 2);	// upcast (programming at interface)
		System.out.println(s1);
		System.out.println("rectangle area is " + s1.getArea());
		
		Shape s2 = new Triangle(3, 4);	// upcast (programming at interface)
		System.out.println(s2);
		System.out.println("triangle area is " + s2.getArea());
		
		/**
		* we cannot create an instance of an interface, see...
		*/
		//Shape s3 = new Shape("green");	// compile error
	}
}
