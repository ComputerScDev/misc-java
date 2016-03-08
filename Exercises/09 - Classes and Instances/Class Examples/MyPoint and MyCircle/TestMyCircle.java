// test 'MyCircle' class
// instantiates a test object of the MyCircle model class

public class TestMyCircle {
	
	public static void main(String[] args) {
		MyCircle c1 = new MyCircle();
		System.out.println(c1);
		c1.setCentreXY(0, 3);
		System.out.println(c1);
		
		MyPoint p1 = new MyPoint(4, 0);
		MyCircle c2 = new MyCircle(p1, 9);
		System.out.println(c2);
		
		// Test distance() method
		System.out.println(c1.distance(c2));
	}
}
