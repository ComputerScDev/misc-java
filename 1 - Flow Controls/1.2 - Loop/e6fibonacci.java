// Exercises on Loops (Iteration). 6 - Fibonacci
//
// compute the first 20 fibonacci numbers, and find their average

public class e6fibonacci {
	public static void main(String[] args) {
		int n = 3;
		int fn;
		int fnMinus1 = 1;
		int fnMinus2 = 1;
		int nMax = 20;
		int sum = fnMinus1 + fnMinus2;
		double average;
		System.out.println("The first " + nMax + " Fibonacci numbers are: ");
		System.out.print(fnMinus1 + " ");
		System.out.print(fnMinus2 + " ");
		double totalsum = 0;
		while (n <= nMax) {
			totalsum += sum;
			System.out.print(sum+" "); // takes the sum from the previous iteration,
			// below we adjust for the new index:
			// example, if n = 4, f(4) = f(3) + f(2),
			// f(3) = f(1) + f(2),
			fnMinus2 = fnMinus1;
			fnMinus1 = sum;
			sum = fnMinus1 + fnMinus2;
			n++;
		}
		// compute and display the average
		System.out.println();
		System.out.println("The average is "+totalsum/nMax);
	}
}