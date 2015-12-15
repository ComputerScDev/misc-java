import java.util.Scanner;

public class GridSystem {
	
	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point(2, 2);
		
		System.out.print("Point p1: ");
		p1.print();
		
		System.out.print("Point p2: ");
		p2.print();
		
		p1.moveto(1,3);
		System.out.print("Point p1 translated to ");
		p1.print();
		
		p2.moveto(0.5,0.1);
		System.out.print("Point p2 translated to ");
		p2.print();
		
		System.out.print("Between (" + p1.getX() + "," + p1.getY() + ") " + "and (" + p2.getX() +"," + p2.getY() +"), ");
		String p3 = (p1.fromOrigin() < p2.fromOrigin()) ? "p1" : "p2";
		System.out.print(p3 + " is closer.");
		
	}
	
}

// Translate point [x]
// Calculate distance from origin. [x]
// Calculate distance between points.
// Determine if a point is on a line.