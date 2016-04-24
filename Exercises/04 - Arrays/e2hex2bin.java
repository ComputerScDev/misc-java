/**
* write a program called Hex2Bin to convert a hexadecimal string 
* into its equivalent binary string.  
*/

import java.util.Scanner;

class e2hex2bin {
	
	// 16 binary 'String' objects corresponding to hex number '0' to 'F'.
	public String[] hexBits = {"0000", "0001", "0010", "0011","0100", "0101", 
	"0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", " 1110", "1111"};
	
	public String convertHextoBinary(String input) {
		int length = input.length();
		String result = "";
		for (int i=0;i<=length-1;i++) {
			switch(input.charAt(i)) {
				case '0': result+=(hexBits[0]+" ");
						break;
				case '1': result+=(hexBits[1]+" ");
						break;
				case '2': result+=(hexBits[2]+" ");
						break;
				case '3': result+=(hexBits[3]+" ");
						break;
				case '4': result+=(hexBits[4]+" ");
						break;
				case '5': result+=(hexBits[5]+" ");
						break;
				case '6': result+=(hexBits[6]+" ");
						break;
				case '7': result+=(hexBits[7]+" ");
						break;
				case '8': result+=(hexBits[8]+" ");
						break;
				case '9': result+=(hexBits[9]+" ");
						break;
				case 'a': result+=(hexBits[10]+" ");
						break;
				case 'b': result+=(hexBits[11]+" ");
						break;
				case 'c': result+=(hexBits[12]+" ");
						break;
				case 'd': result+=(hexBits[13]+" ");
						break;
				case 'e': result+=(hexBits[14]+" ");
						break;
				case 'f': result+=(hexBits[15]+" ");
						break;
			}
		} return result;
	}
	
	public static void main(String[] args) {
		e2hex2bin im = new e2hex2bin();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Hexadecimal string: ");
		String input = in.nextLine().toLowerCase();
		System.out.println("The equivalent binary for hexadecimal '"
		+input+"' is "+im.convertHextoBinary(input));
	}
}

// Alternate code:

/* class e2hex2bin {
	
	public static void main(String[] args) {
		String hexString; // input hex string
		int hexStringLength; // length of hex string
		String binaryString = ""; // equivalent binary string
		
		// binary string corresponding to hex '0' to 'F'
		String[] binaryStrings = {"0000", "0001", "0010", "0011", "0100", "0101", "0110",
		"0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
		
		// read input
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Hexadecimal string: ");
		hexString = in.next();
		hexStringLength = hexString.length();
		
		// Process the string from the left
		
		for (int pos = 0; pos<hexStringLength;++pos) {
			char hexChar = hexString.charAt(pos);
			if (hexChar >= '0' && hexChar <= '9') {
				binaryString+=binaryStrings[hexChar-'0'];
			} else if (hexChar >= 'a' && hexChar <='f') {
				binaryString+=binaryStrings[hexChar-'a'+10];
			} else if (hexChar >= 'A' && hexChar <= 'F') {
				binaryString+=binaryStrings[hexChar-'A'+10];
			} else {
				System.err.println("Error: Invalid Hex String \""+hexString+"\"");
				System.exit(1); //quit
			}
		}
		System.out.println("The equivalent binary for \""+hexString
		+"\" is \""+binaryString+"\"");
	}
	
} */
