import java.io.*;

public class FileIOToken {
	
	public static void main(String[] args) throws IOException {
		String line;
		BufferedWriter fout = new BufferedWriter(new FileWriter("test.dat"));
		
		for(int i = 1; i <= 5; i++) {
			fout.write(i + " " + i*i + " " + i*i*i);
			fout.newLine();
		}
		fout.flush();
		fout.close();
		
		BufferedReader fin = new BufferedReader(new FileReader("test.dat"));
		do {
			line = fin.readLine();
			if (line != null) {
				String[] splitString = line.split(" ");
				int i1 = Integer.parseInt(splitString[0]);
				int i2 = Integer.parseInt(splitString[1]);
				int i3 = Integer.parseInt(splitString[2]);
				System.out.println(i1 + ", " + i2 + ", " + i3);
			}
		} while (line != null);
		fin.close();
	}
}
