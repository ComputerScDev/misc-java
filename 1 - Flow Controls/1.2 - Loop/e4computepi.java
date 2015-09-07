// Exercises on Loops (Iteration). 4 - Compute the value of Pi
//
// we compute the value of pi using the series expansion:
// pi = 4(1-(1/3+(1/5)-(1/7)+...)))

public class e4computepi {
	public static void main(String[] args) {
		double sum = 0;
		int maxDenom = 10000000;
		for (int denom = 1;denom<=maxDenom; denom+=2) {
			if (denom%4 == 1) {
				sum+=(double)4/denom;
			} else if (denom%4 == 3) {
				sum-=(double)4/denom;
			} else {
				System.out.println("Broken.");
			}
		}
		System.out.println("Pi Series Expansion: " + sum);
		System.out.println("Pi JDK Constant: " + Math.PI);
		System.out.println("Percentage Accuracy: " + (double)100*(sum/Math.PI));
	}
}

// We compute the series expansion,
// then invoke the JDK constant,
// and compare the two percentage-wise.
//
// We find that the series expansion is 99.99999363380185% accurate.