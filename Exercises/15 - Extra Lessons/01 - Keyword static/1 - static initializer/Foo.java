/**
* a static initializer is a static-labelled code block which is executed exactly once when the class is loaded.
* during class loading, the JVM allocates static variables and runs the static initializer.
* purpose: for initializing static variables or performing a one-time task for the class.
*/

public class Foo {
	static int number;	// static variable
	static {
		number = 0;
		System.out.println("loading class");
	}	// a static initializer block, runs only once when the class is loaded.
	
	public static void main(String[] args) {
		System.out.println("computing sum from 1 to 100 via loop");
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			number++;
			sum += number;
		}
		System.out.println(number + "\n" + sum + "\nchecking:" + ((number*(number+1))/2));
	}
}
