/**	
* Polymorphism: separates the interface and the implementation
* to allow the programmer to program -at the interface- in the design of
* a complex system.

* what's good about this code is that:
* all references for all objects are from the superclass, not the subclasses themselves
* (i.e. programming at the interface level).

* we can instantiate different subclass instances and the code still works.
* we can extend the program easily by adding more subclasses with ease.
* Below: Test driver for Shape and its superclasses
*/


public class TestShape {
	
	public static void main(String[] args) {
		Shape s1 = new Rectangle("red", 4, 5);	// upcast, instantiates rectangle subclass object using superclass reference
		System.out.println(s1);	// runs Rectangle toString() method (overriden)
		System.out.println("area is " + s1.getArea() + "\n");	// runs Rectangle getArea() method (overriden)
		
		Shape s2 = new Triangle("blue", 4, 5);	// upcast, instantiates triangle subclass object using superclass reference
		System.out.println(s2);	// runs Triangle toString() method (overriden)
		System.out.println("area is " + s2.getArea() + "\n");	// runs Triangle getArea() method (overriden)
		
		/** 
		* however, if we were to instatiate a Shape object and invoke the getArea() method from the Shape object
		* we get an error:
		*/
		Shape s3 = new Shape("green");
		System.out.println(s3);
		System.out.println("area is " + s3.getArea());	// invalid output
		
		/** 
		* this is because the Shape superclass is meant to provide a common -interface- to all its subclasses
		* which are each supposed to provide the actual -implementation-. we do not want anyone to instantiate a Shape instance.
		* this problem is resolved using the 'abstract' class, the next topic...
		*/
	}
}
