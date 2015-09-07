// Exercises on Loops (Iteration). 5 - Coza Loza Woza
//

/* Prints the numbers 1 to 110, eleven numbers per line.
It prints "Coza" in place of multiples of 3, "Loza" for multiples of 5,
and "Woza" for multiples of 7. "CozaLoza" for multiples of 3 and 5, and so on. */

/* public class e5tfs {
	public static void main(String[] args) {
		int lowerbound = 1;
		int upperbound = 110;
		for (int number = lowerbound; number<=upperbound; ++number) {
			//
			if (number%3 == 0) {
				System.out.print("Coza");
				if ((number%5 !=0)&&(number%7!=0)) {
					System.out.print(" ");
				}
			}
			//
			if (number%5 == 0) {
				System.out.print("Loza");
				if ((number%3 !=0)&&(number%7!=0)) {
					System.out.print(" ");
				}
			}
			//
			if (number%7 == 0) {
				System.out.print("Woza");
				if ((number%5 !=0)&&(number%3!=0)) {
					System.out.print(" ");
				}
			}
			// not a multiple
			if ((number%3 !=0)&&(number%5 !=0)&&(number%7 !=0)) {
				System.out.print(" "+ number + " ");
			}
			// new line if divisible by 11.
			if (number%11 == 0) {
				System.out.println();
			}
			//
		}
	}
}
 */
// Try: Modify the program to use nested-if loops instead:
// Note: write out the T-F decision tree for each case, and work
// with the visual aid.

public class e5tfs {
	public static void main(String[] args) {
		int lowerbound = 1;
		int upperbound = 110;
		for (int number = lowerbound; number<=upperbound; ++number) {
			if (number%3 == 0) {
				System.out.print("Coza");
				if (number%5 == 0) {
					System.out.print("Loza");
					if (number%7 == 0) {
						System.out.print("Woza ");
					} else {
						System.out.print(" ");
					}
				} else if (number%7 ==0) {
					System.out.print("Woza ");
				} else {
					System.out.print(" ");
				}
			} else if (number%5 == 0) {
				System.out.print("Loza");
				if (number%7 == 0) {
					System.out.print("Woza ");
				} else {
					System.out.print(" ");
				}
			} else if (number%7 == 0) {
				System.out.print("Woza ");
			} else {
				System.out.print(number+" ");
			}
			if (number%11 == 0) {
				System.out.println();
			}
		}
	}
}
