/** abstract class example
abstract classes provide a 'template for further development',
i.e. provides a common interface (or protocol/contract/naming convention)
to all its subclasses. for example, in abstract class Shape we can define
abstract methods getArea() and draw(). no implementation for these are
possible for Shape itself, but all subclasses are -forced- to use these
method signatures, guaranteeing that they must include implementations
for these methods.

rule of thumb: program at the interface level, not at the implementation.
i.e. make references at the superclass, substitute with subclass instances
and invoke methods defined in the superclass only.
*/

//	Test driver for abstract class Shape and its subclasses
//	Compare this file with the output found in polymorphism 
//	'TestShape.java' Shape example: https://goo.gl/lnXUrE

public class TestShape {
	
	public static void main(String[] args) {
		Shape s1 = new Rectangle("red", 1, 2);
		System.out.println(s1);
		System.out.println("shape area is " + s1.getArea() + "\n");
		
		Shape s2 = new Triangle("red", 1, 2);
		System.out.println(s2);
		System.out.println("shape area is " + s2.getArea() + "\n");
		
		//	note below: we cannot instantiate an abstract class
		//Shape s3 = new Shape("green");	// does not compile
	}
}
