/**
* similar to a class loader, we can use an instance initializer to initialize an instance during installation.
* in practice, this is rarely used.
*/

public class Foo {
	int num;	// instance variable
	{
		num = 0;
		System.out.println("creating an instance...");
	}	// instance initializer block, ran once per install
	
	/**
	* constructor
	*/
	public Foo() {
		super();	// run instance initializer before body of constructor.
		System.out.println("computing sum from 1 to 100 via loop");
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			num++;
			sum += num;
		}
		System.out.println(num + "\n" + sum + "\nchecking:" + ((num*(num+1))/2));
	}	// recall that this was in the main method body in previous Foo example.
	
	public static void main(String[] args) {
		new Foo();
	}
}
