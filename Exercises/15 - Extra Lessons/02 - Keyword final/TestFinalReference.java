/**
* the final keyword continued:
* a final variable of a reference type (i.e. a class or an array) cannot be re-mapped a new value (new reference).
* so we can mondify the content of the instance, but cannot re-map the variable to another instance. an example:
*/

public class TestFinalReference {
	
	public static void main(String[] args) {
		final StringBuffer sb = new StringBuffer("hello");	// final ref type
		sb.append(", world!");	// we edit the contents inside the reference
		System.out.println("the object is \"" + sb + "\"");
		
		/**
		* compilation error: cannot assign a value to final variable
		*/
		sb = new StringBuffer("oops");
	}
}
