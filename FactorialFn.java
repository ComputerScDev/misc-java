import java.io.*;

public class FactorialFn {
	
	public static void main(String[] args) throws IOException, NumberFormatException {
		int n, k, nfact;
		BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			System.out.print("Enter n (0 to quit): ");
			n = Integer.parseInt(cin.readLine());
			
			if (n < 0) {
				System.out.println("Invalid value. Try again.\n");
			} else if (n > 0) {
				System.out.println(n + "! = " + factorial(n) +"\n");
			}
			
		} while (n!=0);		
	} // end main
	
	// calculate factorial
	public static int factorial(int f) {
		int nfact = 1;
		for (int k = 2; k <= f; k++) {
			nfact *= k;
		}
		return nfact;
	} // end factorial
	
}