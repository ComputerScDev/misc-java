public class ArrayFnV2 {
	
	public static void main(String[] args) {
		int[] vals = {1, 3, 5, 7, 9};
		int[] valsSq = squareArray(vals);
		printArray(vals);
		printArray(valsSq);
	} // end of main function
	
	// square individual array elements
	public static int[] squareArray(int[] x) {
		int[] sq = new int[x.length];
		for (int i = 0; i < x.length; i++) {
			sq[i] = x[i]*x[i];
		}
		return sq;
		// array changes in functions happen to local array
	}
	
	// print each element in an array
	public static void printArray(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.println(i + ". " + x[i]);
		}
	}
} // end of class
