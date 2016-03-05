// Exercises on Nested Loops. 2 - Checkerboard
//
// Task: Display a 7x7 (generally, nxn) pattern
// using two nested for-loops
//
// Conditions: only use three output statements, each only once.
//
public class e2checkerboard {
	public static void main(String[] args) {
		int size = 7; // size of board.
		for (int row = 1; row<=7; row++) {
			if ((row%2)==0) {
				System.out.print(" ");
			}
			for (int col = 1; col<=7; col++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
}