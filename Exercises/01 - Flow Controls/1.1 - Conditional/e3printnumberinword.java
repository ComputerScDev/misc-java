/**
* simple decision. print number in words using either nested-if or switch.
*/
// Exercises on Conditionals(Decision). 3 - Print Number in Words (nested-if vs. switch)

public class e3printnumberinword {
	
	public static void main(String[] args) {
		int number = 5;
		/**
		* nested-if
		*/
		/* if (number == 1) {
			System.out.println("ONE");
		} else if (number == 2) {
			System.out.println("TWO");
		} else if (number == 3) {
			System.out.println("THREE");
		} else if (number == 4) {
			System.out.println("FOUR");
		} else if (number == 5) {
			System.out.println("FIVE");
		} else {
			System.out.println("OTHER")
		} */
		
		/**
		* switch
		*/
		switch (number) {
			case 1 : System.out.println("ONE"); break;
			case 2 : System.out.println("TWO"); break;
			case 3 : System.out.println("THREE"); break;
			case 4 : System.out.println("FOUR"); break;
			case 5 : System.out.println("FIVE"); break;
		}
	}
}
