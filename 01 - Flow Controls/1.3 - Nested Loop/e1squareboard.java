// Exercises on Nested Loops. 1 - SquareBoard
//
// Task: Display a 5x5 (generally, nxn) pattern
// using two nested for-loops
//
// Conditions: only use two output statements.
//
public class e1squareboard {
	public static void main(String[] args) {
		int size = 5;
		for (int row = 1; row<=5; row++) {
			for (int col = 1;col<=5;col++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
}