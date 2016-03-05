import java.io.*;

public class LuckySevens_OOP {
	
	public static void main(String[] args) {
		int startingCash = getUserStartingCash();
		LuckySevens game = new LuckySevens(startingCash);
		game.play();
		game.checkFairness();
	} // end main
	
	// get a +ve integer as starting cash
	public static int getUserStartingCash() {
		int x = 0;
		boolean valid;
		String input = null;
		BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			valid = true;
			System.out.print("Enter starting amount of cash (or \"quit\" to quit): ");
			System.out.println();
			try {
				input = cin.readLine();
				if (input.equals("quit")) {
					System.out.println("\nQuitting...\n");
					System.exit(1);
				}
				x = Integer.parseInt(input);
				if (x <= 0) {
					valid = false;
				}
			}
			catch (IOException e) {
				valid = false;
			}
			catch (NumberFormatException e) {
				valid = false;
			}
			if (!valid) {
				System.out.println("\nERROR: Starting amount must be a +ve integer.\n");
			}
		} while (!valid);
		return x;
	} // end getUserStartingCash()
}
