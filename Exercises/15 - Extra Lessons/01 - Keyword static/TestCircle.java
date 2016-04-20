/**
* Testing the static keyword
*/

public class TestCircle {
	
	public static void main(String[] args) {
		Circle c1 = new Circle(1.1);
		System.out.println(c1.count);	// output: 1
		Circle c2 = new Circle(2.2);
		System.out.println(c2.count);	// output: 1
		Circle c3 = new Circle(3.3);
		System.out.println(c3.count);	// output: 1
	}
	/**
	* the 'count' variable is not common to all instances of the Circle class, but rather is specific to the instantiated object itself
	* thus, it is an "instance variable" here. if we wanted 'count' to keep track of how many Circle objects we've created in the program itself,
	* then we must declare it 'static', making it a "class variable" - one that is common to all instances of a class.
	*/
}
