/**
* JVM has a built-in class loader of type java.lang.ClassLoader which loads classes into the Java program's memory.
* if a class is referenced in the program, the class loader searches the classpath for the class file, loads the bytecode
* into memory and instantiates a java.lang.Class object to maintain the loaded class.
* the class-loader loads a class only once, so there's only one java.lang.Class object for each class that's used in the
* program, which stores the static members. during class loading, the class loader also allocates static variables and
* invokes the explicit initializers and static initializers (in order of appearance).
*/

public class Hello {
	private static int n1 = 1;	// explicit initializer
	static {
		n1 = 2;
		n2 = 3;
	}	// static initializer
	private static int n2 = 4;	// explicit initializer
	
	public static void main(String[] args) {
		System.out.println("number #1 is " + n1);	// 2
		System.out.println("number #2 is " + n2);	// 4
	}
}
