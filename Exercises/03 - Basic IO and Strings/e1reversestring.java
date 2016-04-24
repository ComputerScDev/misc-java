/**
* prompts a user for a String and prints the reverse of the String.
*/

import java.util.Scanner;

class e1reversestring {
	
	public static void main(String[] args) {
		String inStr; // input String
		int inStrLen; // length of the input String
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String: ");
		inStr = in.next(); // use next() to read String
		inStrLen = inStr.length();
		
		/**
		* use inStr.charAt(index) to extract character at 'index' from inStr
		*/
		String outStr = ""; // output String
		for (int i = inStrLen-1; i>=0; i--) {
			outStr = outStr+inStr.charAt(i);
		}
		System.out.println("The reverse of String '"+inStr+"' is '"+outStr+"'.");
	}	
}
