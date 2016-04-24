/**
* convert an input binary string into its equivalent decimal number
*/

import java.util.Scanner;

class e4binarytodecimal {
	
	public int convertToDec(String binStr) {
		int dec = 0;
		int binStrLen = binStr.length();
		for (int i=binStrLen-1;i>=0;i--) {
			if (binStr.charAt(i)=='1') {
				dec+=Math.pow(2,i);
			}
		} return dec;
	}
	
	public boolean validcheck (String binStr) {
		return binStr.matches("[0-1]+");
	}
	
	public static void main(String[] args) {
		e4binarytodecimal im = new e4binarytodecimal();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a binary string:");
		String binStr = in.nextLine();
		while (im.validcheck(binStr) == false) {
			System.out.println("Invalid binary string.");
			binStr = in.nextLine();
		} 
		System.out.println("is "+ im.convertToDec(binStr)+" as a decimal.");
	}
}
