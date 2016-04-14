/**
* upcasting & downcasting
* subclass B of superclass A, with subclass C
*/

public class B extends A {
	
	/**
	* constructor
	*/
	public B() {
		super();
		System.out.println("constructed B");
	}
	
	@Override
	public String toString() {
		return "this is object B";
	}
}
