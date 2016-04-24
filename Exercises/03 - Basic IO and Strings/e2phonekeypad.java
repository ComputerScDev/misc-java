/**
* On your phone keypad, the alphabets are mapped to digits as follows: 
* ABC(2), DEF(3), GHI(4), JKL(5), MNO(6), PQRS(7), TUV(8), WXYZ(9).
* 
* Write a program called PhoneKeyPad, which prompts user for a String 
* (case insensitive), and converts to a sequence of Keypad digits. 
* Use a nested-if (or switch-case) in this exercise. Modify your program 
* to use an array for table look-up later.
* 
* Hints: You can use in.next().toLowerCase() to read a string and convert it 
* to lowercase to reduce your cases. 
*/

import java.util.Scanner;
import java.math.BigInteger;

class e2phonekeypad {
	
	public static void main(String[] args) {
		String inStr;
		int inStrLen;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String: ");
		inStr = in.nextLine().toLowerCase();
		inStrLen = inStr.length();
		
		String outStr = ""; // output String
		for (int i = 0; i<=inStrLen-1; i++) {
			if ((inStr.charAt(i)=='a')||(inStr.charAt(i)=='b')||
			(inStr.charAt(i)=='c')) {
				outStr=outStr+"2";
			} else if ((inStr.charAt(i)=='d')||(inStr.charAt(i)=='e')||
			(inStr.charAt(i)=='f')) {
				outStr=outStr+"3";
			} else if ((inStr.charAt(i)=='g')||(inStr.charAt(i)=='h')||
			(inStr.charAt(i)=='i')) {
				outStr=outStr+"4";
			} else if ((inStr.charAt(i)=='j')||(inStr.charAt(i)=='k')||
			(inStr.charAt(i)=='l')) {
				outStr=outStr+"5";
			} else if ((inStr.charAt(i)=='m')||(inStr.charAt(i)=='n')||
			(inStr.charAt(i)=='o')) {
				outStr=outStr+"6";
			} else if ((inStr.charAt(i)=='p')||(inStr.charAt(i)=='q')||
			(inStr.charAt(i)=='r')||(inStr.charAt(i)=='s')) {
				outStr=outStr+"7";
			} else if ((inStr.charAt(i)=='t')||(inStr.charAt(i)=='u')||
			(inStr.charAt(i)=='v')) {
				outStr=outStr+"8";
			} else if ((inStr.charAt(i)=='w')||(inStr.charAt(i)=='x')||
			(inStr.charAt(i)=='y')||(inStr.charAt(i)=='z')) {
				outStr=outStr+"9";
			} else {
				outStr=outStr+"";
			}
		}
		BigInteger output = new BigInteger(outStr);
		System.out.println(output);	
	}	
}
