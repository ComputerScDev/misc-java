import java.io.*;

public class DistanceCalculator {
	
	// member fields (variables) : everything we need to know
	private double speed;	// speed from user in mph
	private double time;	// time from user in min
	
	public void getUserInput() {
		this.speed = getNonnegDouble("Enter a speed (miles/hour): ");
		this.time = getNonnegDouble("Enter a time traveled (minutes): ");
	}
	
	public void printDistance() {
		System.out.format("The distance traveled is %.3f miles.\n", this.speed*this.time/60.0);
	}
	
	public void setValues(double speed, double time) {
		this.speed = speed;
		this.time = time;
		System.out.println("New distance calculation values:");
		this.printValues();
	}
	
	public void printValues() {
		System.out.println(this.speed);
		System.out.println(this.time);
	}
	
	// a 'void' constructor:
	// DistanceCalculator dc = new DistanceCalculator();
	public DistanceCalculator() {
		this.speed = 0;
		this.time = 0;
	}
	
	// an alternate constructor:
	// DistanceCalculator dc = new DistanceCalculator(5.2, 20.75);
	public DistanceCalculator(double speed, double time) {
		this.speed = speed;
		this.time = time;
	}
	
	// a static method
	public static double calcDist(int speed, int time) {
		return speed*time/60.0;
	}
	
	// get a non-negative double from the user
	public static double getNonnegDouble(String prompt) {
		BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
		double x = 0;
		boolean valid;
		do {
			valid = true;
			System.out.print(prompt);
			try {
				x = Double.parseDouble(cin.readLine());
			}
			catch (NumberFormatException e) {
				System.out.println("ERROR: Number format exception.\n");
				valid = false;
			}
			catch (IOException e) {
				System.out.println("ERROR: IO exception.\n");
				valid = false;
			}
			if (valid && x < 0) {
				valid = false;
				System.out.println("ERROR: Value must be non-negative.\n");
			}
		} while (!valid);
		return x;
	} // end of getNonnegDouble()
	
} // end of DistanceCalculator class
