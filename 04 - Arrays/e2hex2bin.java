/* Write a program called Hex2Bin to convert a hexadecimal string 
into its equivalent binary string.  */

import java.util.Scanner;

class e2hex2bin {
	
	// 16 binary 'String' objects corresponding to hex number '0' to 'F'.
	public String[] hexBits = {"0000", "0001", "0010", "0011","0100", "0101", 
	"0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", " 1110", "1111"};
	
	public String convertHextoBinary(String input) {
		e2hex2bin im = new e2hex2bin();
		int length = input.length();
		String result = "";
		for (int i=0;i<=length-1;i++) {
			switch(input.charAt(i)) {
				case '0': result+=(im.hexBits[0]+" ");
						break;
				case '1': result+=(im.hexBits[1]+" ");
						break;
				case '2': result+=(im.hexBits[2]+" ");
						break;
				case '3': result+=(im.hexBits[3]+" ");
						break;
				case '4': result+=(im.hexBits[4]+" ");
						break;
				case '5': result+=(im.hexBits[5]+" ");
						break;
				case '6': result+=(im.hexBits[6]+" ");
						break;
				case '7': result+=(im.hexBits[7]+" ");
						break;
				case '8': result+=(im.hexBits[8]+" ");
						break;
				case '9': result+=(im.hexBits[9]+" ");
						break;
				case 'a': result+=(im.hexBits[10]+" ");
						break;
				case 'b': result+=(im.hexBits[11]+" ");
						break;
				case 'c': result+=(im.hexBits[12]+" ");
						break;
				case 'd': result+=(im.hexBits[13]+" ");
						break;
				case 'e': result+=(im.hexBits[14]+" ");
						break;
				case 'f': result+=(im.hexBits[15]+" ");
						break;
			}
		} return result;
	}
	
	public static void main(String[] args) {
		e2hex2bin im = new e2hex2bin();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Hexadecimal string: ");
		String input = in.nextLine().toLowerCase();
		System.out.println("The equivalent binary for hexadecimal '"
		+input+"' is "+im.convertHextoBinary(input));
	}
	
}