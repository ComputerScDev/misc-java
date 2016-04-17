import java.io.*;

public class AddAbsValFn {
	
	public static void main(String[] args) throws IOException, NumberFormatException {
		double x, y, absSum;
		BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter two numbers: ");
		x = Double.parseDouble(cin.readLine());
		y = Double.parseDouble(cin.readLine());
		
		absSum = addAbsVal(x, y);
		
		System.out.format("|%.2f| + |%.2f| = %.2f\n", x, y, absSum);
		
	}
	
	public static double addAbsVal(double x, double y) {
		return Math.abs(x) + Math.abs(y);
	}
}
