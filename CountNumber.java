import java.util.Scanner;

class CountNumber {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String line = in.nextLine();
		
		int spaceCount = 0;
		for (char c : line.toCharArray()) {
			if (c == ' ') {
				spaceCount++;
			}
		}
		
		System.out.println(spaceCount+1);
	}
}
