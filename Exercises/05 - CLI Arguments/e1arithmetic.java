/**
* Write a program called Arithmetic that takes three command-line arguments: 
* two integers followed by an arithmetic operator (+, -, * or /). 
* The program shall perform the corresponding operation on the two integers 
* and print the result. 
*/

class e1arithmetic {
	
	public static void main(String[] args) {
		int operand1, operand2;
		char theOperator;
		
		operand1 = Integer.parseInt(args[0]);	// convert String to int
		operand2 = Integer.parseInt(args[1]);
		theOperator = args[2].charAt(0);	// consider only the first character. i.e. in the string argument args[2], we take the first character.
		
		System.out.print(args[0]+args[2]+args[1]+"=");
		switch(theOperator) {
			case ('+'): System.out.println(operand1 + operand2);
						break;
			case ('-'): System.out.println(operand1 - operand2);
						break;
			case ('*'): System.out.println(operand1 * operand2);
						break;
			case ('/'): System.out.println(operand1 / operand2);
						break;
			default: System.out.printf("%nError: Invalid operator.");	// %n is a line break.
		}
	}
}

/* Sample output:
> java e1arithmetic 3 2 +
3+2=5
> java e1arithmetic 3 2 -
3-2=1
> java e1arithmetic 3 2 /
3/2=1 */
