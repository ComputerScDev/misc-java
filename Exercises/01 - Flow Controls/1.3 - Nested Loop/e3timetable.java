/**
* Task: Produce the 1-to-9 product table.
* Output should mimic:
*  * |  1  2  3  4  5  6  7  8  9
-------------------------------
*  1 |  1  2  3  4  5  6  7  8  9
*  2 |  2  4  6  8 10 12 14 16 18
*  3 |  3  6  9 12 15 18 21 24 27
*  4 |  4  8 12 16 20 24 28 32 36
*  5 |  5 10 15 20 25 30 35 40 45
*  6 |  6 12 18 24 30 36 42 48 54
*  7 |  7 14 21 28 35 42 49 56 63
*  8 |  8 16 24 32 40 48 56 64 72
*  9 |  9 18 27 36 45 54 63 72 81
* next, do the 1-to-12 product table.
*/

public class e3timetable {
	
	public static void main(String[] args) {
		int size = 9;
		
		for (int row = 1; row <= size + 2; ++row) {
			/**
			* below: prints the top margin.
			*/
			if (row == 1) {
				System.out.print(" * |");
				int count = 1;
				while (count <= size) {
					System.out.print("  " + count);
					count++;
				}
			}
			/**
			* below: prints a border for 2nd row.
			*/
			if (row == 2) {
				int r = 1;
				while (r <= 31) {
					System.out.print("-");
					r++;
				}
			}
			/**
			* below: this entire block executes for each row, from row 3 to row 11
			*/
			if (row >= 3) {
				System.out.print(" " + (row-2) + " |"); // prints the side margin
				for (int col = 1; col <= size; ++col) {
					if (((row-2) * col) >= 10) {
						System.out.print(" ");
					} else {
						System.out.print("  ");
					}
					System.out.print((row - 2) * (col));
				}
			}
			System.out.println();
		}
	}
}

// below is code for size = 12.

/* public class e3timetable {
	public static void main(String[] args) {
		int size = 12;
		for (int row = 1; row<=size+2;++row) {
			// below: prints the top margin.
			if (row == 1) {
				System.out.print(" * |");
				int count = 1;
				while (count<=size) {
					System.out.print("  "+count);
					count++;
				}
			}
			// below: prints a border for 2nd row.
			if (row == 2) {
				int r = 1;
				while (r <=43) {
					System.out.print("-");
					r++;
				}
			}
			// below: this entire block executes for each row, from row 3 to row 14.
			if (row >= 3) {
				if (row < 12) {
					System.out.print(" "+(row-2)+ " |"); // prints the side margin
					for (int col = 1; col<=size;++col) {
						if (((row-2)*col)>=10) {
							if (col < 10) {
								System.out.print(" ");
							} else {
								System.out.print("  ");
							}
						} else {
							System.out.print("  ");
						}
						System.out.print((row-2)*(col));
					}
				} else {
					System.out.print(" "+(row-2)+ "|"); // prints the side margin
					for (int col = 1; col<=size;++col) {
						if ((col == 10)&&((row == 12)||(row == 13))) {
							System.out.print("  ");
							System.out.print((row-2)*(col));
						} else {
							System.out.print(" ");
							System.out.print((row-2)*(col));
						}
					}
				}
			}
			System.out.println();
		}
	}
} */

/* 			below is an alternate while-loop for the 2nd nested-if.	
				while (count <= 9) {
					if (((row-2)*count)>=10) {
						System.out.print(" ");
					} else {
						System.out.print("  ");
					}
					System.out.print((row-2)*(count));
					count++;
				} */