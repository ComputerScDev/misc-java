/**	
* upcasting & downcasting:
* substituting a subclass instance for its superclass is called 'upcasting',
* since a subclass is drawn below its superclass in UML. upcasting is always safe
* since a subclass instance contains all properties of its superclass.
* the compiler checks for valid upcasting, issuing errors when incompatible.
* 
* we can revert a substituted instance back to a subclass reference,
* this is called 'downcasting'. this requires -explicit type casting operator-
* in the form of prefix operator (new-type). downcasting is not always safe,
* and throws a runtime 'ClassCastException' if the instance to be downcasted
* doesn't belong to the right subclass. a subclass object can be substituted
* for its superclass, but not conversely.
* Below: superclass A with subclass B, with subclass C
*/


public class A {
	
	/**
	* constructor
	*/
	public A() {
		System.out.println("constructed A");
	}
	
	public String toString() {
		return "this is object A";
	}
}
