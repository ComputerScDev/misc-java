/**
* upcasting & downcasting
* subclass C of subclass B of superclass A
*/

public class C extends B {
	
	/**
	* constructor
	*/
	public C() {
		super();
		System.out.println("constructed C");
	}
	
	@Override
	public String toString() {
		return "this is object C";
	}
}
