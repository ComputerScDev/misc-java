/**
* ... or we can add an import statement to use the classname alone w/o the package name
* an example:
*/

/**
* we can import a signle class using its fully qualified name, or...
*/
import java.util.Scanner;
/**
* we can import all the classes in a package..
*/
import java.awt.*;

public class ScannerWithImport {
	
	public static void main(String[] args) {
		/**
		* package name can be omitted for an imported class
		* javac searches the import statements for the fully qualified name
		*/
		Scanner in = new Scanner(System.in);
		System.out.print("enter an integer: ");
		int num = in.nextInt();
		System.out.println(num + " entered");
	}
}

/**
* import does not load the class, that's done by the class loader. rather, it resolves a
* classname to its fully qualified name, or 'brings the classname into the namespace'.
* import is strictly a compiled-time activity. javac replaces the classnames with their
* fully qualified names and removes all the import statements in the compiled bytecode.
* there is a slight compile-time cost but no runtime cost.
*/
