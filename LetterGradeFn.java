import java.io.*;

public class LetterGradeFn {
	
	public static BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException, NumberFormatException {
		char letter;
		double num = getNonnegDouble("Enter numerical grade: ");
		letter = getLetterGrade(num);
		System.out.format("%.2f -> %s\n", num, letter);
		
	} // end main
	
	// transform a numerial score into a letter grade
	public static char getLetterGrade(double score) {
		if (score < 50) return 'F';
		if (score < 60) return 'D';
		if (score < 70) return 'C';
		if (score < 80) return 'B';
		else return 'A';
	}

	public static double getNonnegDouble(String prompt) {
		double num = 0;
		boolean valid;
		
		// exception handling below
		do {
			valid = true;
			System.out.print(prompt);
			try {
				num = Double.parseDouble(cin.readLine());
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
