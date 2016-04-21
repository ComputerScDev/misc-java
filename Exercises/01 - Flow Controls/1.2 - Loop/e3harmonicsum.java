/**
* computes a harmonic sum
*/

public class e3harmonicsum {
	
	public static void main(String[] args) {
		int maxDenominator = 50000;
		double sumL2R = 0.0;
		double sumR2L = 0.0;
		
		/**
		* left to right
		*/
		for (int denominator = 1; denominator <= maxDenominator; ++denominator) {
			sumL2R += (double)1 / denominator;
		}
		
		/**
		* right to left
		*/
		for (int denominator = 1; denominator <= maxDenominator; ++denominator) {
			sumR2L+=(double)1 / (maxDenominator - denominator + 1);
		}
		System.out.println("L2R: "+ sumL2R); //Output: 11.397003949278504
		System.out.println("R2L: "+ sumR2L); //Output: 11.397003949278519
		System.out.println("Difference: " + Math.max(sumL2R-sumR2L,sumR2L-sumL2R));
	}
}

/**
* Why the difference isn't 0?
* Arithmetically, it should be 0. However, since floating point numbers in
* java are not precise representation of numbers, when we sum from right to left - we're summing from smallest
* to largest - and the least sig.figs have a change to accumulate; while in the left to right sum, where a longer
* part of the "fractional part of the log" needs to be dropped for the smallest added numbers.
*/
