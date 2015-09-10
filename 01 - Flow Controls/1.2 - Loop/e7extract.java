// Exercises on Loops (Iteration). 7 - Extract and Reverse Digits
//
public class e7extract {
	public static void main(String[] args) {
		int n = 1542;
		while (n>0) {
			int digit = n%10; 
			// above: extract the last digit - ex: 1542 mod 10 = 2
			// 154 mod 10 = 4, 15 mod 10 = 5, 10 mod 10 = 1.
			System.out.print(digit);
			if (n > 10) {
				System.out.print(",");
			}
			// above: prints a comma iff we're not at the final iteration.
			n = n/10; 
			// above: drop the last digit and repeat loop
			// 1542/10 = 154.2, rounded to int is 154. etc..
		}
	}
}