/**
* to reference a class in our code, we can either use the fully-qualified name in the form of
* 'packagename.classname', an example:
*/

public class ScannerNoImport {
	
	public static void main(String[] args) {
		/**
		* use fully qualified name in all the references
		*/
		java.util.Scanner in = new java.util.Scanner(System.in);	// here, it's 'java.util.Scanner' we're using
		System.out.print("enter an integer: ");
		int num = in.nextInt();
		System.out.println(num + " entered");
	}
}
