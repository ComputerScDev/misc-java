/**
* we can import static members of a class via the import static declaration.
* we can omit the classname for an imported static member. 
* import static takes the following syntax:
* import static packagename.classname.staticMemberName;
* import static packagename.classname.*;
* example...
*/

import static java.lang.System.out;	// import static variable 'out' of System class
import static java.lang.Math.*;	// import all static members in Math class

public class TestImportStatic {
	
	public static void main(String[] args) {
		/**
		* classname can be omitted for imported static members
		*/
		out.println("PI is " + PI);
		out.println("sqrt of PI is" + sqrt(PI));
	}
}
