import java.io.*;

public class FileIO {
	
	public static void main(String[] args) throws IOException {
		int i = 1;
		String line;
		
		BufferedWriter fout = new BufferedWriter(new FileWriter("test.dat"));
		do {
			fout.write(i + " " + i*i);
			fout.newLine();
		} while (i++ < 5);
		fout.flush();
		fout.close();
		
		BufferedReader fin = new BufferedReader(new FileReader("test.dat"));
		do {
			line = fin.readLine();
			if (line != null) {
				System.out.println(line);
			}
		} while (line != null);
		fin.close();
	}
	
}
