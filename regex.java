import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.*;

public class regex {
	
	public static void main(String[] args) throws IOException {
		String strPattern, strInput;
		BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			System.out.print("\nEnter your pattern: ");
			strPattern = cin.readLine();
			Pattern pattern = Pattern.compile(strPattern);
			
			do {
				System.out.print("\nEnter your input string (0 to enter new pattern): ");
				strInput = cin.readLine();
				
				if (!strInput.equals("0")) {
					
					Matcher matcher = pattern.matcher(strInput);
					
					boolean found = false;
					while (matcher.find()) {
						System.out.format ("Found the text \"%s\" starting at " + "index %d and ending at index %d.\n",
						matcher.group(), matcher.start(), matcher.end());
						found = true;
					}
					if (!found) {
						System.out.println("No match found.");
					}
				} // end check if user wants to quit
				
			} while (!strInput.equals("0"));
		} // infinite loop
	} // end main
 } // end class
 