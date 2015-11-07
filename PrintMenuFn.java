import java.io.*;

public class PrintMenuFn {
	
	public static void main(String[] args) throws IOException, NumberFormatException {
		int choice;
		BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			printMenu();
			choice = Integer.parseInt(cin.readLine());
			
			if (choice == 1) {
				System.out.println("\nRUN CHOICE 1\n");
			} else if (choice == 2) {
				System.out.println("\nRUN CHOICE 2\n");
			} else if (choice != 0) {
				System.out.println("ERROR: Invalid menu choice.\n");
			}
			
		} while (choice != 0);
		
	}
	
	public static void printMenu() {
		System.out.println("Menu Template Program\n");
		System.out.println("0 - Quit");
		System.out.println("1 - Option 1");
		System.out.println("2 - Option 2");
		System.out.print("\nEnter choice: ");
	}
}
