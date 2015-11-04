public class OddPrime {
	
	public static void main(String[] args) {
		// start table heading
		System.out.println("No.     Odd  Prime");
		System.out.println("------------------");
		// end table heading
		
		for (int i = 0; i < 100; i++) {
			String odd = isOdd(i) ? "X" : "";
			String prime = isPrime(i) ? "X" : "";
			System.out.format("%3d%7s%7s\n", i, odd, prime);
			// tabular (column) layout
		} // end loop over integers
	} // end main
	
	// determine if an integer is prime
	public static boolean isPrime(int n) {
		for (int i = 2; i <= n-1; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	} // end isPrime
	
	// determine if an integer is odd
	public static boolean isOdd(int n) {
		if ((n%2) == 1) {
			return true;
		} else {
			return false;
		}
	} // end isOdd
}