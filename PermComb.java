import java.io.*;

public class PermComb {
	
	public static BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException, NumberFormatException {
		int num = getInt("Enter integer value n: ");
		int num2 = getInt("Enter integer value r: ");
		System.out.println(num + " P " + num2 + ": " + permutation(num, num2));
		System.out.println(num + " C " + num2 + ": " + combination(num, num2));
	} // end of main function
	
	// permutation n P r: n! / (n-r)!
	public static int permutation(int n, int r) {
		return factorial(n) / factorial(n-r);
	}
	
	public static int permutationV2(int n, int r) {
		int perm = 1;
		for (int i = n-r+1; i <= n; i++) {
			perm *= i;
		}
		return perm;
	}
	
	// combination n C r: n!/ (r!(n-r)!)
	public static int combination(int n, int r) {
		return factorial(n) / ( factorial(r) * factorial(n-r) );
	}
	
	public static int combinationV2(int n, int r) {
		int comb = permutation(n,r);
		for (int i = 1; i <=r; i++) {
			comb /= i;
		}
		return comb;
	}
	
	// factorial helper-method
	public static int factorial(int f) {
		int nfact = 1;
		for (int k = 2; k <= f; k++) {
			nfact *= k;
		}
		return nfact;
	}
	
	// exception handling
	public static int getInt(String prompt) {
		int num = 0;
		boolean valid;
		
		do {
			valid = true;
			System.out.print(prompt);
			try {
				num = Integer.parseInt(cin.readLine());
			}
			catch (NumberFormatException e) {
				System.out.println("ERROR: Number format exception!\n");
				valid = false;
			}
			catch (IOException e) {
				System.out.println("ERROR: IO exception!\n");
				valid = false;
			}
			if (valid && num<0) {
				valid = false;
				System.out.println("ERROR: Value must be non-negative!\n");
			}
		} while (!valid);
		return num;
	}
}
