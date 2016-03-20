public class TestMyPoint {
	
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(3, 0);
		MyPoint p2 = new MyPoint(0, 4);
		System.out.println("Distance from " + p1.toString() + " to " + p2.toString() + ": " + p1.distance(p2) + 
		"\nDistance from " + p1.toString() +" to (5, 6): " + p1.distance(5,6));
	}	
}
