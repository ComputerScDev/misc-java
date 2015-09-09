import java.util.Scanner;
import java.math.BigInteger;

class e5hextodecimal {
	
	public String characters = "0123456789ABCDEF";
	
	public static int hex2dec(String str) {
		e5hextodecimal im = new e5hextodecimal();
		str = str.toUpperCase();
		int val = 0;
		for (int i=0;i<str.length(); i++) {
			val = (16*val)+im.characters.indexOf(str.charAt(i));
		} return val;
	}
	
	public static String dec2hex(BigInteger dec) {
		e5hextodecimal im = new e5hextodecimal();
		if (dec == BigInteger.ZERO) {
			return "0";
		}
		BigInteger sixteen = new BigInteger("16");
		String hex = "";
		while (dec.signum()==1) {
			BigInteger digit = dec.mod(sixteen);
			hex+=im.characters.charAt(digit.intValue());
			dec=dec.divide(sixteen);
		} return hex;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		e5hextodecimal im = new e5hextodecimal();
		System.out.println("Choose a data type to convert:");
		System.out.println("1: Hex to Decimal, 2: Decimal to Hex.");
		String choice = in.nextLine();
		while (((choice.equals("1"))||(choice.equals("2")))==false) {
				System.out.println("Invalid input. Try again:");
				choice = in.nextLine();
			}
		if (choice.equals("1")) {
			System.out.println("Enter the hex string to convert:");
			String str = in.nextLine();
			System.out.println("is "+im.hex2dec(str)+" as a decimal.");
		} else if (choice.equals("2")) {
			System.out.println("Enter the decimal to convert:");
			BigInteger dec = in.nextBigInteger();
			System.out.println("is "+im.dec2hex(dec)+" as a hex.");
		} 

	}
	
}
