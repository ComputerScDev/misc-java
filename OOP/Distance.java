/* Write a program that asks the user for a speed and 
amount of time, and calculates the distance travelled. */

import java.io.*;

public class Distance {
	
	public static BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) {
		double speed = getNonnegDouble("Enter a speed (miles/hour): ");
		double time = getNonnegDouble("Enter a time travelled (minutes): ");
		
		System.out.format("The distance traveled is %.3f miles. \n", speed*time/60.0);
		// end of main function
	}
	
	// get a non-negative double from the user
	public static double getNonnegDouble(String prompt) {
		double x = 0;
		boolean valid;
		
		// exception handling below
		do {
			valid = true;
			System.out.print(prompt);
			try {
				x = Double.parseDouble(cin.readLine());
			}
			catch (NumberFormatException e) {
				System.out.println("ERROR: Number format exception!\n");
				valid = false;
			}
			catch (IOException e) {
				System.out.println("ERROR: IO exception!\n");
				valid = false;
			}
			if (valid && x<0) {
				valid = false;
				System.out.println("ERROR: Value must be non-negative!\n");
			}
		} while (!valid);
		return x;
	} 
}
