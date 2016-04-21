/**
* the following is the sequence of events for when a new object is instantiated via the 'new' operator. i.e. the instantiation process.
* 1. JVM allocates memory for the instance, 2. JVM initializes the instance variables to their assigned or default values,
* 3. JVM invokes the constructor, 4. The first statement of the constructor is always a call to the immediate superclass constructor. JVM invokes it.
* 5. JVM executes the instance initializers in order of appearance, 6. JVM executes the constructor body. 7. The 'new' operator returns an object reference.
*/

public class Hello {
	private int n1 = 1;	// explicit initializer
	{
		n1 = 2;
		n2 = 3;
	}	// instance initializer
	private int n2 = 4;	// explicit initializer
	
	public Hello() {}	// empty constructor, invokes all initializers in order
	public Hello(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}	// runs after initializers
	
	public static void main(String[] args) {
		Hello h = new Hello();
		System.out.println("number #1 is " + h.n1);	// 2
		System.out.println("number #2 is " + h.n2 + "\n");	// 4
		
		Hello h2 = new Hello(6, 8);
		System.out.println("number #1 is " + h2.n1);	// 5
		System.out.println("number #2 is " + h2.n2);	// 6
	}
}
