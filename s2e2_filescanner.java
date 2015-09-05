import java.util.Scanner; // need to use scanner for input
import java.io.File; // need to use file
import java.io.FileNotFoundException; // need for file operation

public class s2e2_filescanner {
	public static void main(String[] args) throws FileNotFoundException {
		int num1;
		double num2;
		String name;
		double sum;
		
		// Set-up a scanner to read from a text file
		Scanner in = new Scanner(new File("in.txt"));
		num1 = in.nextInt(); // use nextInt() to read int
		num2 = in.nextDouble(); // use nextDouble() to read double
		name = in.next(); // use next() to read String
		
		// Display
		System.out.println("The integer read is "+num1);
		System.out.println("The floating point read is "+num2);
		System.out.println("The String read is "+name);

		System.out.println("Hi! "+name+", the sum of "+num1+" and "+num2+" is "+(num1+num2)+".");
	}
}