public class ArrayFn {
	
	public static void main(String[] args) {
		int[] vals = {1, 3, 5, 7, 9};
		printArray(vals);
		squareArray(vals); // the array's values change after this call.
		printArray(vals);
	} // end of main function
	
	// square individual array elements
	public static void squareArray(int[] x) {
		for (int i = 0; i < x.length; i++) {
			x[i] *= x[i];
		}
	}
	
	// print each element in an array
	public static void printArray(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.println(i + ". " + x[i]);
		}
	}
} // end of class
