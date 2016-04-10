//	Test driver for superclass A and its subclasses
//	demonstrates upcasting & downcasting

public class TestCasting {
	
	public static void main(String[] args) {
		A a1 = new C();	// upcast, we're constructing object A using a reference to object C
		//	above goes through constructors for A, B, C
		System.out.println(a1);	// runs overriding C object toString()
		B b1 = (B)a1;	// downcast object A to a B object - ok
		C c1 = (C)b1;	// downcast object B to a C object - ok
		System.out.println(b1 + "\n" + c1);
		//	notice that calling b1's toString() invokes C's toString() method
		//	since it overrides both A and B's toString() methods
		System.out.println(a1 instanceof C);	// true
		System.out.println(a1 instanceof B);	// true
		System.out.println(a1 instanceof A);	// true
		System.out.println();
		System.out.println(b1 instanceof C);	// true
		System.out.println(b1 instanceof B);	// true
		System.out.println(b1 instanceof A);	// true
		System.out.println();
		System.out.println(c1 instanceof C);	// true
		System.out.println(c1 instanceof B);	// true
		System.out.println(c1 instanceof A);	// true
		System.out.println();
		
		A a2 = new B();	// upcast, we're constructing object A using a reference to object B
		System.out.println(a2);	// runs overriding B object toString()
		B b2 = (B)a2;	// downcast object A to a B object - ok
		System.out.println(b2);	// runs B's native toString() method
		System.out.println(a2 instanceof C);	// false, since we use a reference to object B
		System.out.println(a2 instanceof B);	// true
		System.out.println(a2 instanceof A);	// true
		System.out.println();
		System.out.println(b2 instanceof C);	// false
		System.out.println(b2 instanceof B);	// true
		System.out.println(b2 instanceof A);	// true
		C c2 = (C)a2;	// downcast object A to a C object - compiles, but throws ClassCastException
	}
	
}
