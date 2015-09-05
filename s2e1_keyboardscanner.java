// Exercises on Keyboard & File Input. 1 - Keyboard Scanner
//
// Task: Write a program to prompt a user for an integer, a double
// and a string. 

import java.util.Scanner;
public class s2e1_keyboardscanner {
	public static void main(String[] args) {
		int num1;
		double num2;
		String name;
		double sum;
		
		// Setup a Scanner called-in to scan the keyboard (System.in)
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		num1 = in.nextInt(); // use nextInt() method to read the int
		System.out.print("Enter a floating point: ");
		num2 = in.nextDouble(); // use nextDouble() method to read double
		System.out.print("Enter your name: ");
		name = in.next(); // use next() method to read String
		
		// Display:
		System.out.println("Hi! "+name+", the sum of "+num1+" and "+num2+" is "+(num1+num2)+".");
	}
}