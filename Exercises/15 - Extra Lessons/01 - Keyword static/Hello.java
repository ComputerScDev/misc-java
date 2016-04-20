/**
* Example: instance method (non-static method) can access static (class) methods/variables and other instance methods/variables
* not the other way around. note that static members cannot be hidden/overriden in the subclass as non-static.
*/

public class Hello {
	
	private static String msgStatic = "Hello from static";	// class variable
	private String msgInstance = "Hello from non-static";	// instance variable
	
	public static void main(String[] args) {
		System.out.println(msgStatic);	// runs, since static main method can access only other static (class) members
		//System.out.println(msgInstance);	// doesn't run, since static method cannot access non-static (instance) members
	}
}
