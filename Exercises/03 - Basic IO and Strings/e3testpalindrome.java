/**
* checks if the input String is a palindrome
*/

import java.util.Scanner;

class e3testpalindrome {
	
	private static String regularExpression = "[^A-z]";
	
	public String reverseStr(String exStr) {
		int exStrLen = exStr.length();
		String outStr = ""; // output String.
		for (int i = exStrLen-1; i>=0; i--) {
			outStr = outStr+exStr.charAt(i);
		} return outStr;
	}
	
	public static void main(String[] args) {
		String inStr; // input String.
		e3testpalindrome im = new e3testpalindrome();
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a phrase/word: ");
		inStr = in.nextLine(); // Get unmodified String.
		String exStr = inStr.toLowerCase().replaceAll(regularExpression, "");
		
		/** 
		* create modified String
		*/
		String outStr = im.reverseStr(exStr);
		if (exStr.equals(outStr)) {
			System.out.println(inStr+" is a palindrome.");
		} else {
			System.out.println(inStr+" is not a palindrome.");
		}	
	}
}
