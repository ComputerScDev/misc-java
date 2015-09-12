/* Write a program called SumDigits to sum up the individual digits of a 
positive integer, given in the command line. Sample output:
> java e2sumdigits 12345
The sum of digits = 1 + 2 + 3 + 4 + 5 = 15  */

class e2sumdigits {
	
	public static void main(String[] args) {
		if (args.length > 1) {
			System.out.print("Invalid input.");
			return;
		}
		String output = "";
		int sum = 0;
		for (int i=0;i<=args[0].length()-1;i++) {
			sum+=Integer.parseInt(Character.toString(args[0].charAt(i)));
			output+=Character.toString(args[0].charAt(i));
			if (i<args[0].length()-1) {
				output+=" + ";
			}
		}
		System.out.println("The sum of digits = "+output+" = "+sum);
	}
	
}
