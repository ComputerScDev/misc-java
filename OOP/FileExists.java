import java.io.*;

public class FileExists {
	
	public static void main(String[] args) throws IOException {
		BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a file name or directory to check: ");
		String filename = cin.readLine();
		
		File file = new File(filename);
		
		boolean exists = file.exists();
		if (!exists) {
			System.out.println(filename + " does not exist!");
		} else {
			System.out.println(filename + " exists!");
		}
	}
}