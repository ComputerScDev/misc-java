import java.util.Scanner;


class e3circlecomputation {
	
	public double computeArea(double radius) {
		return Math.PI*Math.pow(radius, 2);
	}
	
	public double computeCircumference(double radius) {
		return 2*Math.PI*radius;
	}
	
	public static void main(String[] args) {
		e3circlecomputation im = new e3circlecomputation();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius = in.nextDouble();
		System.out.println("The area is "+ im.computeArea(radius));
		System.out.println("The circumference is "+ im.computeCircumference(radius));
	}
	
}